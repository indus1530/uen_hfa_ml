package edu.aku.hassannaqvi.uen_hfa_ml.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_hfa_ml.R;
import edu.aku.hassannaqvi.uen_hfa_ml.contracts.ChildContract;
import edu.aku.hassannaqvi.uen_hfa_ml.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_ml.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_ml.databinding.ActivitySectionF3Binding;
import edu.aku.hassannaqvi.uen_hfa_ml.datecollection.AgeModel;
import edu.aku.hassannaqvi.uen_hfa_ml.datecollection.DateRepository;

import static edu.aku.hassannaqvi.uen_hfa_ml.core.MainApp.child;
import static edu.aku.hassannaqvi.uen_hfa_ml.utils.UtilKt.openEndActivity;

public class SectionF3Activity extends AppCompatActivity {

    ActivitySectionF3Binding bi;
    boolean imFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f3);
        bi.setCallback(this);
        setTitle(R.string.chsec);
        setupListeners();
        setupTextWatchers();

    }

    private void setupTextWatchers() {
       /* editTextImplementation(new EditTextPicker[]{bi.im41bcgdd, bi.im41bcgmm, bi.im41bcgyy});
        editTextImplementation(new EditTextPicker[]{bi.im42opv0dd, bi.im42opv0mm, bi.im42opv0yy});
        editTextImplementation(new EditTextPicker[]{bi.im43opv1dd, bi.im43opv1mm, bi.im43opv1yy});
        editTextImplementation(new EditTextPicker[]{bi.im44penta1dd, bi.im44penta1mm, bi.im44penta1yy});
        editTextImplementation(new EditTextPicker[]{bi.im45pcv1dd, bi.im45pcv1mm, bi.im45pcv1yy});
        editTextImplementation(new EditTextPicker[]{bi.im46rv1dd, bi.im46rv1mm, bi.im46rv1yy});
        editTextImplementation(new EditTextPicker[]{bi.im47opv2dd, bi.im47opv2mm, bi.im47opv2yy});
        editTextImplementation(new EditTextPicker[]{bi.im48penta2dd, bi.im48penta2mm, bi.im48penta2yy});
        editTextImplementation(new EditTextPicker[]{bi.im49pcv2dd, bi.im49pcv2mm, bi.im49pcv2yy});
        editTextImplementation(new EditTextPicker[]{bi.im410rv2dd, bi.im410rv2mm, bi.im410rv2yy});
        editTextImplementation(new EditTextPicker[]{bi.im411opv3dd, bi.im411opv3mm, bi.im411opv3yy});
        editTextImplementation(new EditTextPicker[]{bi.im412penta3dd, bi.im412penta3mm, bi.im412penta3yy});
        editTextImplementation(new EditTextPicker[]{bi.im413pcv3dd, bi.im413pcv3mm, bi.im413pcv3yy});
        editTextImplementation(new EditTextPicker[]{bi.im414ipvdd, bi.im414ipvmm, bi.im414ipvyy});
        editTextImplementation(new EditTextPicker[]{bi.im415measles1dd, bi.im415measles1mm, bi.im415measles1yy});
        editTextImplementation(new EditTextPicker[]{bi.im416measles2dd, bi.im416measles2mm, bi.im416measles2yy});*/
    }

    public void editTextImplementation(EditTextPicker[] editTextsArray) {
        if (editTextsArray.length != 3) return;
        EditTextPicker editTextPicker01 = editTextsArray[0];
        EditTextPicker editTextPicker02 = editTextsArray[1];
        EditTextPicker editTextPicker03 = editTextsArray[2];

        for (EditTextPicker item : new EditTextPicker[]{editTextPicker01, editTextPicker02}) {
            item.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    editTextPicker03.setText(null);
                    editTextPicker03.setError(null);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }

        editTextPicker03.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String txt01, txt02, txt03;
                editTextPicker01.setEnabled(true);
                editTextPicker02.setEnabled(true);
                if (!TextUtils.isEmpty(editTextPicker01.getText()) && !TextUtils.isEmpty(editTextPicker02.getText()) && !TextUtils.isEmpty(editTextPicker03.getText())) {
                    txt01 = editTextPicker01.getText().toString();
                    txt02 = editTextPicker02.getText().toString();
                    txt03 = editTextPicker03.getText().toString();
                } else return;
                if ((!editTextPicker01.isRangeTextValidate() || txt01.trim().equals("44") || txt01.trim().equals("97")) ||
                        (!editTextPicker02.isRangeTextValidate() || txt02.trim().equals("44") || txt02.trim().equals("97")) ||
                        (!editTextPicker03.isRangeTextValidate() || txt03.trim().equals("44") || txt03.trim().equals("97")))
                    return;
                int day = Integer.parseInt(txt01);
                int month = Integer.parseInt(txt02);
                int year = Integer.parseInt(txt03);
                AgeModel age = DateRepository.Companion.getCalculatedAge(year, month, day);
                if (age == null) {
                    editTextPicker03.setError("Invalid date!!");
                    imFlag = false;
                } else {
                    imFlag = true;
                    editTextPicker01.setEnabled(false);
                    editTextPicker02.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void setupListeners() {

        /*Clear.clearAllFields(bi.fldGrpSecChc2, getIntent().getBooleanExtra(IM02FLAG, true));

        bi.im10.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.im101.getId()) {
                Clear.clearAllFields(bi.fldGrpSecChc5, true);
            } else {
                Clear.clearAllFields(bi.fldGrpSecChc5, false);
            }

        });  */

    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesChildColumn(ChildContract.SingleChild.COLUMN_SCC, child.getsCC());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("f0301", bi.f0301a.isChecked() ? "1"
                : bi.f0301b.isChecked() ? "2"
                : "-1");

        json.put("f0301aa", "-1");

        json.put("f0301aaa0a", bi.f0301aaa0ay.isChecked() ? "1"
                : bi.f0301aaa0an.isChecked() ? "2"
                : bi.f0301aaa0aq.isChecked() ? "3"
                : "-1");

        json.put("f0301aaa0aqx", bi.f0301aaa0aqx.getText().toString());
        json.put("f0301aaa0f", bi.f0301aaa0fy.isChecked() ? "1"
                : bi.f0301aaa0fn.isChecked() ? "2"
                : bi.f0301aaa0fq.isChecked() ? "3"
                : "-1");

        json.put("f0301aaa0fqx", bi.f0301aaa0fqx.getText().toString());
        json.put("f0302", bi.f0302a.isChecked() ? "1"
                : bi.f0302b.isChecked() ? "2"
                : "-1");

        json.put("f0302aa", "-1");

        json.put("f0302aaa0a", bi.f0302aaa0ay.isChecked() ? "1"
                : bi.f0302aaa0an.isChecked() ? "2"
                : bi.f0302aaa0aq.isChecked() ? "3"
                : "-1");

        json.put("f0302aaa0aqx", bi.f0302aaa0aqx.getText().toString());
        json.put("f0302aaa0f", bi.f0302aaa0fy.isChecked() ? "1"
                : bi.f0302aaa0fn.isChecked() ? "2"
                : bi.f0302aaa0fq.isChecked() ? "98"
                : "-1");

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void BtnContinue() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                startActivity(new Intent(this, SectionF4Activity.class).putExtra("complete", true));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void BtnEnd() {
        openEndActivity(this);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
