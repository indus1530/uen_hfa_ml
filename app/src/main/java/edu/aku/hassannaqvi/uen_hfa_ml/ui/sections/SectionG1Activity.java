package edu.aku.hassannaqvi.uen_hfa_ml.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_hfa_ml.R;
import edu.aku.hassannaqvi.uen_hfa_ml.contracts.ChildContract;
import edu.aku.hassannaqvi.uen_hfa_ml.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_ml.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_ml.databinding.ActivitySectionG1Binding;

import static edu.aku.hassannaqvi.uen_hfa_ml.core.MainApp.child;
import static edu.aku.hassannaqvi.uen_hfa_ml.utils.UtilKt.openEndActivity;

public class SectionG1Activity extends AppCompatActivity {

    ActivitySectionG1Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        bi.setCallback(this);
        setTitle(R.string.modgtitle);
        setupListeners();
    }

    private void setupListeners() {

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

        json.put("g0101", bi.g0101a.isChecked() ? "1"
                : bi.g0101b.isChecked() ? "2"
                : bi.g0101c.isChecked() ? "3"
                : bi.g0101d.isChecked() ? "4"
                : bi.g0101e.isChecked() ? "5"
                : bi.g0101f.isChecked() ? "6"
                : bi.g0101x.isChecked() ? "96"
                : "-1");

        json.put("g0101xx", bi.g0101xx.getText().toString());
        json.put("g0102", "-1");

        json.put("g0102a", bi.g0102aa.isChecked() ? "1"
                : bi.g0102ab.isChecked() ? "2"
                : "-1");

        json.put("g0102b", bi.g0102ba.isChecked() ? "1"
                : bi.g0102bb.isChecked() ? "2"
                : "-1");

        json.put("g0103", bi.g0103a.isChecked() ? "1"
                : bi.g0103b.isChecked() ? "98"
                : bi.g0103x.isChecked() ? "96"
                : "-1");

        json.put("g0104", bi.g0104a.isChecked() ? "1"
                : bi.g0104b.isChecked() ? "2"
                : bi.g0104c.isChecked() ? "3"
                : bi.g0104d.isChecked() ? "4"
                : bi.g0104e.isChecked() ? "5"
                : bi.g0104f.isChecked() ? "6"
                : bi.g0104g.isChecked() ? "7"
                : "-1");

        json.put("g0105", bi.g0105a.isChecked() ? "1"
                : bi.g0105b.isChecked() ? "2"
                : bi.g0105c.isChecked() ? "3"
                : "-1");

        json.put("g0105ax", bi.g0105ax.getText().toString());
        json.put("g0105bx", bi.g0105bx.getText().toString());
        json.put("g0105cx", bi.g0105cx.getText().toString());
        json.put("g0106", bi.g0106a.isChecked() ? "1"
                : bi.g0106b.isChecked() ? "2"
                : bi.g0106c.isChecked() ? "3"
                : bi.g0106d.isChecked() ? "4"
                : bi.g0106x.isChecked() ? "96"
                : "-1");

        json.put("g0106xx", bi.g0106xx.getText().toString());
        json.put("g0107", bi.g0107a.isChecked() ? "1"
                : bi.g0107b.isChecked() ? "2"
                : bi.g0107c.isChecked() ? "3"
                : bi.g0107x.isChecked() ? "96"
                : "-1");

        json.put("g0107xx", bi.g0107xx.getText().toString());
        json.put("g0108", "-1");

        json.put("g0108a", bi.g0108aa.isChecked() ? "1"
                : bi.g0108ab.isChecked() ? "2"
                : "-1");

        json.put("g0108b", bi.g0108ba.isChecked() ? "1"
                : bi.g0108bb.isChecked() ? "2"
                : "-1");

        json.put("g0108c", bi.g0108ca.isChecked() ? "1"
                : bi.g0108cb.isChecked() ? "2"
                : "-1");

        json.put("g0109", bi.g0109a.isChecked() ? "1"
                : bi.g0109b.isChecked() ? "2"
                : bi.g0109c.isChecked() ? "3"
                : bi.g0109d.isChecked() ? "4"
                : "-1");

        json.put("g0110", bi.g0110a.isChecked() ? "1"
                : bi.g0110b.isChecked() ? "2"
                : bi.g0110c.isChecked() ? "3"
                : "-1");

        json.put("g0110ax", bi.g0110ax.getText().toString());
        json.put("g0110bx", bi.g0110bx.getText().toString());
        json.put("g0110cx", bi.g0110cx.getText().toString());
        json.put("g0111", bi.g0111a.isChecked() ? "1"
                : bi.g0111b.isChecked() ? "2"
                : "-1");

        json.put("g01112", bi.g01112a.isChecked() ? "1"
                : bi.g01112b.isChecked() ? "2"
                : bi.g01112x.isChecked() ? "96"
                : "-1");

        json.put("g01112xx", bi.g01112xx.getText().toString());
        json.put("g01113", bi.g01113a.isChecked() ? "1"
                : bi.g01113b.isChecked() ? "2"
                : "-1");

        json.put("g01114", bi.g01114a.isChecked() ? "1"
                : bi.g01114b.isChecked() ? "2"
                : bi.g01114c.isChecked() ? "3"
                : "-1");

        json.put("g01115", bi.g01115a.isChecked() ? "1"
                : bi.g01115b.isChecked() ? "2"
                : bi.g01115c.isChecked() ? "3"
                : "-1");

        json.put("g01116", bi.g01116a.isChecked() ? "1"
                : bi.g01116b.isChecked() ? "2"
                : "-1");

        json.put("g01117", bi.g01117a.isChecked() ? "1"
                : bi.g01117b.isChecked() ? "2"
                : bi.g01117c.isChecked() ? "3"
                : bi.g01117d.isChecked() ? "4"
                : bi.g01117e.isChecked() ? "5"
                : "-1");


       /* try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(child.getsCC()), json);

            child.setsCC(String.valueOf(json_merge));

        } catch (JSONException e) {
            e.printStackTrace();
        }*/
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
                startActivity(new Intent(this, SectionG2Activity.class));

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