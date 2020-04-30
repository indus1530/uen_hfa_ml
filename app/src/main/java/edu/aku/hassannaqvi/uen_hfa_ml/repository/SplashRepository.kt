package edu.aku.hassannaqvi.uen_hfa_ml.repository

import android.content.Context
import edu.aku.hassannaqvi.uen_hfa_ml.core.DatabaseHelper
import edu.aku.hassannaqvi.uen_hfa_ml.ui.other.SplashscreenActivity.Companion.districtsMap
import edu.aku.hassannaqvi.uen_hfa_ml.ui.other.SplashscreenActivity.Companion.provinces
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private suspend fun getEnumGeoArea(context: Context) = withContext(Dispatchers.IO) {
    val db = DatabaseHelper(context)
    return@withContext db.enumBlock.map { it.geoarea.partialList(0, 2) }
}

suspend fun getEnumData(context: Context): MutableMap<String, String> {
    val enumLst = getEnumGeoArea(context)
    val splitLst: MutableMap<String, String> = mutableMapOf()
    enumLst.forEach { item ->
        splitLst[item[1]] = item[0]
    }
    return splitLst
}

private suspend fun getEnumContract(context: Context, province: String, district: String) = withContext(Dispatchers.IO) {
    val db = DatabaseHelper(context)
    return@withContext db.enumBlock.find { it.geoarea.partialList(0, 2)[1] == district }
}

suspend fun setProvinceDistricts(context: Context, def: MutableMap<String, String>) {
    def.entries.forEach { item ->
        if (!provinces.contains(item.value)) provinces.add(item.value)
        getEnumContract(context, item.value, item.key)?.let { districtsMap[item.key] = Pair(item.value, it) }
    }
}

suspend fun populatingSpinners(context: Context) {
    GlobalScope.launch {
        val def = withContext(Dispatchers.Main) { getEnumData(context) }
        if (def.isNotEmpty())
            withContext(Dispatchers.Main) { setProvinceDistricts(context, def) }
    }
}

private fun String.partialList(min: Int, max: Int): List<String> {
    val items = this.split("|")
    return when {
        items.size < max || items.size < min -> items.subList(0, 0)
        else -> items.subList(min, max)
    }
}