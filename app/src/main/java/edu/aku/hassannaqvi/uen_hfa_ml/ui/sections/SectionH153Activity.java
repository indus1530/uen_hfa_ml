package edu.aku.hassannaqvi.uen_hfa_ml.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_hfa_ml.R;
import edu.aku.hassannaqvi.uen_hfa_ml.databinding.ActivitySectionH153Binding;
import edu.aku.hassannaqvi.uen_hfa_ml.ui.other.SectionMainActivity;

import static edu.aku.hassannaqvi.uen_hfa_ml.utils.UtilKt.openEndActivity;

public class SectionH153Activity extends AppCompatActivity {

    ActivitySectionH153Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h153);
        bi.setCallback(this);
        setupSkips();

    }


    private void setupSkips() {

        bi.h1501q0a.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.h1501q0ay.getId()) {
                bi.fldGrpCVh1501q0b.setVisibility(View.VISIBLE);
                bi.fldGrpCVh1501q0c.setVisibility(View.VISIBLE);
                bi.fldGrpCVh1501q0d.setVisibility(View.VISIBLE);
            } else {
                Clear.clearAllFields(bi.fldGrpCVh1501q0b);
                Clear.clearAllFields(bi.fldGrpCVh1501q0c);
                Clear.clearAllFields(bi.fldGrpCVh1501q0d);
                bi.fldGrpCVh1501q0b.setVisibility(View.GONE);
                bi.fldGrpCVh1501q0c.setVisibility(View.GONE);
                bi.fldGrpCVh1501q0d.setVisibility(View.GONE);
            }
        }));

        bi.h1501q0c.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.h1501q0cy.getId()) {
                bi.fldGrpCVh1501q0d.setVisibility(View.VISIBLE);
            } else {
                Clear.clearAllFields(bi.fldGrpCVh1501q0d);
                bi.fldGrpCVh1501q0d.setVisibility(View.GONE);
            }
        }));

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
                startActivity(new Intent(this, SectionMainActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }

        }
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SH, fc.sH());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();


        json.put("h1501q0a", bi.h1501q0ay.isChecked() ? "1"
                : bi.h1501q0an.isChecked() ? "2"
                : "-1");

        json.put("h1501q0b", bi.h1501q0by.isChecked() ? "1"
                : bi.h1501q0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501q0c", bi.h1501q0cy.isChecked() ? "1"
                : bi.h1501q0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501q0dy", bi.h1501q0dy.getText().toString());

        json.put("h1501q0dn", bi.h1501q0dn.getText().toString());


        json.put("h1501r0a", bi.h1501r0ay.isChecked() ? "1"
                : bi.h1501r0an.isChecked() ? "2"
                : "-1");

        json.put("h1501r0b", bi.h1501r0by.isChecked() ? "1"
                : bi.h1501r0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501r0c", bi.h1501r0cy.isChecked() ? "1"
                : bi.h1501r0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501r0dy", bi.h1501r0dy.getText().toString());

        json.put("h1501r0dn", bi.h1501r0dn.getText().toString());


        json.put("h1501s0a", bi.h1501s0ay.isChecked() ? "1"
                : bi.h1501s0an.isChecked() ? "2"
                : "-1");

        json.put("h1501s0b", bi.h1501s0by.isChecked() ? "1"
                : bi.h1501s0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501s0c", bi.h1501s0cy.isChecked() ? "1"
                : bi.h1501s0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501s0dy", bi.h1501s0dy.getText().toString());

        json.put("h1501s0dn", bi.h1501s0dn.getText().toString());


        json.put("h1501t0a", bi.h1501t0ay.isChecked() ? "1"
                : bi.h1501t0an.isChecked() ? "2"
                : "-1");

        json.put("h1501t0b", bi.h1501t0by.isChecked() ? "1"
                : bi.h1501t0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501t0c", bi.h1501t0cy.isChecked() ? "1"
                : bi.h1501t0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501t0dy", bi.h1501t0dy.getText().toString());

        json.put("h1501t0dn", bi.h1501t0dn.getText().toString());


        json.put("h1501u0a", bi.h1501u0ay.isChecked() ? "1"
                : bi.h1501u0an.isChecked() ? "2"
                : "-1");

        json.put("h1501u0b", bi.h1501u0by.isChecked() ? "1"
                : bi.h1501u0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501u0c", bi.h1501u0cy.isChecked() ? "1"
                : bi.h1501u0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501u0dy", bi.h1501u0dy.getText().toString());

        json.put("h1501u0dn", bi.h1501u0dn.getText().toString());


        json.put("h1501v0a", bi.h1501v0ay.isChecked() ? "1"
                : bi.h1501v0an.isChecked() ? "2"
                : "-1");

        json.put("h1501v0b", bi.h1501v0by.isChecked() ? "1"
                : bi.h1501v0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501v0c", bi.h1501v0cy.isChecked() ? "1"
                : bi.h1501v0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501v0dy", bi.h1501v0dy.getText().toString());

        json.put("h1501v0dn", bi.h1501v0dn.getText().toString());


        json.put("h1501w0a", bi.h1501w0ay.isChecked() ? "1"
                : bi.h1501w0an.isChecked() ? "2"
                : "-1");

        json.put("h1501w0b", bi.h1501w0by.isChecked() ? "1"
                : bi.h1501w0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501w0c", bi.h1501w0cy.isChecked() ? "1"
                : bi.h1501w0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501w0dy", bi.h1501w0dy.getText().toString());

        json.put("h1501w0dn", bi.h1501w0dn.getText().toString());


        json.put("h1501x0a", bi.h1501x0ay.isChecked() ? "1"
                : bi.h1501x0an.isChecked() ? "2"
                : "-1");

        json.put("h1501x0b", bi.h1501x0by.isChecked() ? "1"
                : bi.h1501x0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501x0c", bi.h1501x0cy.isChecked() ? "1"
                : bi.h1501x0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501x0dy", bi.h1501x0dy.getText().toString());

        json.put("h1501x0dn", bi.h1501x0dn.getText().toString());

        json.put("h1501y0a", bi.h1501y0ay.isChecked() ? "1"
                : bi.h1501y0an.isChecked() ? "2"
                : "-1");

        json.put("h1501y0b", bi.h1501y0by.isChecked() ? "1"
                : bi.h1501y0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501y0c", bi.h1501y0cy.isChecked() ? "1"
                : bi.h1501y0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501y0dy", bi.h1501y0dy.getText().toString());

        json.put("h1501y0dn", bi.h1501y0dn.getText().toString());


        json.put("h1501z0a", bi.h1501z0ay.isChecked() ? "1"
                : bi.h1501z0an.isChecked() ? "2"
                : "-1");

        json.put("h1501z0b", bi.h1501z0by.isChecked() ? "1"
                : bi.h1501z0bn.isChecked() ? "2"
                : "-1");

        json.put("h1501z0c", bi.h1501z0cy.isChecked() ? "1"
                : bi.h1501z0cn.isChecked() ? "2"
                : "-1");

        json.put("h1501z0dy", bi.h1501z0dy.getText().toString());

        json.put("h1501z0dn", bi.h1501z0dn.getText().toString());

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpNameSectionH15);

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

            // Fetch info text from strings.xml
            //String infoText = (String) getResources().getText(stringRes);

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
