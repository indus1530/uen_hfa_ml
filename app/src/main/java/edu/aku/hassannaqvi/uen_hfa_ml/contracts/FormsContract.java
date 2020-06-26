package edu.aku.hassannaqvi.uen_hfa_ml.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    public static final String CONTENT_AUTHORITY = "edu.aku.hassannaqvi.uen_hfa_ml";
    public static final String PATH_FORMS = "Forms";
    private final String projectName = "UEN_HFA_ML2020";

    public static String one = "1";
    public static String two = "2";
    public static String three = "3";
    public static String four = "4";
    public static String five = "5";
    public static String six = "6";
    public static String seven = "7";
    public static String eight = "8";
    public static String nine = "9";
    public static String ten = "10";
    public static String eleven = "11";
    public static String twelve = "12";
    public static String thirteen = "13";
    public static String fourteen = "14";
    public static String fifteen = "15";
    public static String sixteen = "16";
    public static String nSix = "96";
    public static String nSeven = "97";
    public static String nEight = "98";
    public static String nNine = "99";


    private String _ID = "";
    private String _UID = "";
    private String uuid = "";
    private String formdate = "";
    private String serialno = "";
    private String istatus = ""; // Interview Status
    private String istatus88x = ""; // Interview Status
    private String endingdatetime = "";
    private String gpsLat = ""; // gpsLat
    private String gpsLng = ""; // gpsLng
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion = "";
    private String a01;
    private String a03d;
    private String a03m;
    private String a03y;
    private String a07;
    private String a08;
    private String a09;
    private String a10;
    private String a11;
    private String a12;
    private String a13;
    private String sB;
    private String sC;
    private String sD;
    private String sE;
    private String sF;
    private String sG;
    private String sH;
    private String sI;
    private String sJ;
    private String sK;


    public FormsContract() {
    }


    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }


    public FormsContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(FormsTable.COLUMN_ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.uuid = jsonObject.getString(FormsTable.COLUMN_UUID);
        this.formdate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.serialno = jsonObject.getString(FormsTable.COLUMN_SERIALNO);
        this.a01 = jsonObject.getString(FormsTable.COLUMN_A01);
        this.a03d = jsonObject.getString(FormsTable.COLUMN_A03D);
        this.a03m = jsonObject.getString(FormsTable.COLUMN_A03M);
        this.a03y = jsonObject.getString(FormsTable.COLUMN_A03Y);
        this.a07 = jsonObject.getString(FormsTable.COLUMN_A07);
        this.a08 = jsonObject.getString(FormsTable.COLUMN_A08);
        this.a09 = jsonObject.getString(FormsTable.COLUMN_A09);
        this.a10 = jsonObject.getString(FormsTable.COLUMN_A10);
        this.a11 = jsonObject.getString(FormsTable.COLUMN_A11);
        this.a12 = jsonObject.getString(FormsTable.COLUMN_A12);
        this.a13 = jsonObject.getString(FormsTable.COLUMN_A13);
        this.sB = jsonObject.getString(FormsTable.COLUMN_SB);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        this.sH = jsonObject.getString(FormsTable.COLUMN_SH);
        this.sI = jsonObject.getString(FormsTable.COLUMN_SI);
        this.sJ = jsonObject.getString(FormsTable.COLUMN_SJ);
        this.sK = jsonObject.getString(FormsTable.COLUMN_SK);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.istatus88x = jsonObject.getString(FormsTable.COLUMN_ISTATUS88x);
        this.endingdatetime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDATE);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);
        this.appversion = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);


        return this;

    }


    public FormsContract hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UUID));
        this.formdate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.serialno = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SERIALNO));
        this.a01 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A01));
        this.a03d = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A03D));
        this.a03m = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A03M));
        this.a03y = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A03Y));
        this.a07 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A07));
        this.a08 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A08));
        this.a09 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A09));
        this.a10 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A10));
        this.a11 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A11));
        this.a12 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A12));
        this.a13 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_A13));
        this.sB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB));
        this.sC = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC));
        this.sD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SK));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.istatus88x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS88x));
        this.endingdatetime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDATE));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appversion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(FormsTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
        json.put(FormsTable.COLUMN_FORMDATE, this.formdate == null ? JSONObject.NULL : this.formdate);
        json.put(FormsTable.COLUMN_SERIALNO, this.serialno == null ? JSONObject.NULL : this.serialno);
        json.put(FormsTable.COLUMN_A01, this.a01 == null ? JSONObject.NULL : this.a01);
        json.put(FormsTable.COLUMN_A03D, this.a03d == null ? JSONObject.NULL : this.a03d);
        json.put(FormsTable.COLUMN_A03M, this.a03m == null ? JSONObject.NULL : this.a03m);
        json.put(FormsTable.COLUMN_A03Y, this.a03y == null ? JSONObject.NULL : this.a03y);
        json.put(FormsTable.COLUMN_A07, this.a07 == null ? JSONObject.NULL : this.a07);
        json.put(FormsTable.COLUMN_A08, this.a08 == null ? JSONObject.NULL : this.a08);
        json.put(FormsTable.COLUMN_A09, this.a09 == null ? JSONObject.NULL : this.a09);
        json.put(FormsTable.COLUMN_A10, this.a10 == null ? JSONObject.NULL : this.a10);
        json.put(FormsTable.COLUMN_A11, this.a11 == null ? JSONObject.NULL : this.a11);
        json.put(FormsTable.COLUMN_A12, this.a12 == null ? JSONObject.NULL : this.a12);
        json.put(FormsTable.COLUMN_A13, this.a13 == null ? JSONObject.NULL : this.a13);
        json.put(FormsTable.COLUMN_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(FormsTable.COLUMN_SC, this.sC == null ? JSONObject.NULL : this.sC);
        json.put(FormsTable.COLUMN_SD, this.sD == null ? JSONObject.NULL : this.sD);
        json.put(FormsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(FormsTable.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(FormsTable.COLUMN_SG, this.sG == null ? JSONObject.NULL : this.sG);
        json.put(FormsTable.COLUMN_SH, this.sH == null ? JSONObject.NULL : this.sH);
        json.put(FormsTable.COLUMN_SI, this.sI == null ? JSONObject.NULL : this.sI);
        json.put(FormsTable.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : this.sJ);
        json.put(FormsTable.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(FormsTable.COLUMN_ISTATUS88x, this.istatus88x == null ? JSONObject.NULL : this.istatus88x);
        json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingdatetime == null ? JSONObject.NULL : this.endingdatetime);
        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSDATE, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(FormsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);

        return json;
    }


    public String getProjectName() {
        return projectName;
    }


    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }


    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }


    public String getFormdate() {
        return formdate;
    }

    public void setFormdate(String formdate) {
        this.formdate = formdate;
    }


    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }


    public String getA01() {
        return a01;
    }

    public void setA01(String a01) {
        this.a01 = a01;
    }


    public String getA03d() {
        return a03d;
    }

    public void setA03d(String a03d) {
        this.a03d = a03d;
    }


    public String getA03m() {
        return a03m;
    }

    public void setA03m(String a03m) {
        this.a03m = a03m;
    }


    public String getA03y() {
        return a03y;
    }

    public void setA03y(String a03y) {
        this.a03y = a03y;
    }


    public String getA07() {
        return a07;
    }

    public void setA07(String a07) {
        this.a07 = a07;
    }


    public String getA08() {
        return a08;
    }

    public void setA08(String a08) {
        this.a08 = a08;
    }


    public String getA09() {
        return a09;
    }

    public void setA09(String a09) {
        this.a09 = a09;
    }


    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }


    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }


    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }


    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }


    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }


    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }


    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }


    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }


    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }


    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }


    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }


    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }


    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }


    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }


    public String getIstatus88x() {
        return istatus88x;
    }

    public void setIstatus88x(String istatus88x) {
        this.istatus88x = istatus88x;
    }


    public String getEndingdatetime() {
        return endingdatetime;
    }

    public void setEndingdatetime(String endingdatetime) {
        this.endingdatetime = endingdatetime;
    }


    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }


    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }


    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }


    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }


    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }


    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }


    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }


    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "Forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_SERIALNO = "serialno";
        public static final String COLUMN_A01 = "a01";
        public static final String COLUMN_A03D = "a03d";
        public static final String COLUMN_A03M = "a03m";
        public static final String COLUMN_A03Y = "a03y";
        public static final String COLUMN_A07 = "a07";
        public static final String COLUMN_A08 = "a08";
        public static final String COLUMN_A09 = "a09";
        public static final String COLUMN_A10 = "a10";
        public static final String COLUMN_A11 = "a11";
        public static final String COLUMN_A12 = "a12";
        public static final String COLUMN_A13 = "a13";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";
        public static final String COLUMN_SE = "sE";
        public static final String COLUMN_SF = "sF";
        public static final String COLUMN_SG = "sG";
        public static final String COLUMN_SH = "sH";
        public static final String COLUMN_SI = "sI";
        public static final String COLUMN_SJ = "sJ";
        public static final String COLUMN_SK = "sK";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS88x = "istatus88x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDATE = "gpsdate";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";


        public static String _URL = "sync.php";
    }
}
