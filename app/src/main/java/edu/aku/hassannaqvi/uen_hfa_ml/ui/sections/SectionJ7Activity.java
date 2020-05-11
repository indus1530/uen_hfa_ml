package edu.aku.hassannaqvi.uen_hfa_ml.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_hfa_ml.R;
import edu.aku.hassannaqvi.uen_hfa_ml.contracts.FormsContract;
import edu.aku.hassannaqvi.uen_hfa_ml.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_ml.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_ml.databinding.ActivitySectionJ7Binding;

import static edu.aku.hassannaqvi.uen_hfa_ml.utils.UtilKt.openEndActivity;

public class SectionJ7Activity extends AppCompatActivity {

    ActivitySectionJ7Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_j7);
        bi.setCallback(this);
        setupSkips();

    }

    private void setupSkips() {

        /*bi.ss22.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ss22b.getId()) {
                Clear.clearAllFields(bi.fldGrpCVss23, false);
            } else {
                Clear.clearAllFields(bi.fldGrpCVss23, true);
            }
        }));*/


        /*bi.ss24.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.ss24b.getId()) {
                Clear.clearAllFields(bi.ss25cvall, false);
            } else {
                Clear.clearAllFields(bi.ss25cvall, true);
            }
        }));*/

    }


    public void BtnContinue() {
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                startActivity(new Intent(this, SectionJ8Activity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }

        }
    }


    private boolean UpdateDB() {

        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SM, MainApp.fc.getsM());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("j0700", bi.j0700a.isChecked() ? "1"
                : bi.j0700b.isChecked() ? "2"
                : "-1");

        json.put("j0700aa", bi.j0700aaa.isChecked() ? "1"
                : bi.j0700aab.isChecked() ? "2"
                : "-1");

        json.put("j0701a", bi.j0701aa.isChecked() ? "1"
                : bi.j0701ab.isChecked() ? "2"
                : "-1");

        json.put("j0701b", bi.j0701ba.isChecked() ? "1"
                : bi.j0701bb.isChecked() ? "2"
                : "-1");

        json.put("j0701c", bi.j0701ca.isChecked() ? "1"
                : bi.j0701cb.isChecked() ? "2"
                : "-1");

        json.put("j0701d", bi.j0701da.isChecked() ? "1"
                : bi.j0701db.isChecked() ? "2"
                : "-1");

        json.put("j0701e", bi.j0701ea.isChecked() ? "1"
                : bi.j0701eb.isChecked() ? "2"
                : "-1");

        json.put("j0701f", bi.j0701fa.isChecked() ? "1"
                : bi.j0701fb.isChecked() ? "2"
                : "-1");

        json.put("j0701ga", bi.j0701ga.isChecked() ? "1" : "-1");
        json.put("j0701gb", bi.j0701gb.isChecked() ? "2" : "-1");
        json.put("j0701gc", bi.j0701gc.isChecked() ? "3" : "-1");
        json.put("j0701gd", bi.j0701gd.isChecked() ? "4" : "-1");
        json.put("j0701ge", bi.j0701ge.isChecked() ? "5" : "-1");
        json.put("j0701gf", bi.j0701gf.isChecked() ? "6" : "-1");
        json.put("j0701gx", bi.j0701gx.isChecked() ? "96" : "-1");
        json.put("j0701gxx", bi.j0701gxx.getText().toString());

        MainApp.fc.setsM(String.valueOf(json));

    }


    private boolean formValidation() {

        return Validator.emptyCheckingContainer(this, bi.GrpNameSectionJ7);

    }


    public void BtnEnd() {
        openEndActivity(this);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


    public void showTooltip(@NotNull View view) {
        if (view.getId() != View.NO_ID) {
            String package_name = getApplicationContext().getPackageName();

            // Question Number Textview ID must be prefixed with q_ e.g.: 'q_aa12a'
            String infoid = view.getResources().getResourceName(view.getId()).replace(package_name + ":id/q_", "");

            // Question info text must be suffixed with _info e.g.: aa12a_info
            int stringRes = this.getResources().getIdentifier(infoid + "_info", "string", getApplicationContext().getPackageName());

            // Check if string resource exists to avoid crash on missing info string
            if (stringRes != 0) {

                // Fetch info text from strings.xml
                String infoText = (String) getResources().getText(stringRes);

                new AlertDialog.Builder(this)
                        .setTitle("Info: " + infoid.toUpperCase())
                        .setMessage(infoText)
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .show();
            } else {
                Toast.makeText(this, "No information available on this question.", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No ID Associated with this question.", Toast.LENGTH_SHORT).show();

        }
    }
}