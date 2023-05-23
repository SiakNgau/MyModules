package sg.edu.rp.c346.id22027706.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView tvInfo;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("value");

        if (moduleSelected.equals("M1")) {
            tvInfo.setText("Module code: C235 \nModule Name: IT Security and Management \nAcademic Year: 2023 \nSemester: 1 \nModule Credit: 4 \nVenue: W64P");
        } else if (moduleSelected.equals("M2")) {
            tvInfo.setText("Module code: C346 \nModule Name: Mobile App Development \nAcademic Year: 2023 \nSemester: 1 \nModule Credit: 4 \nVenue: E63A");
        } else if (moduleSelected.equals("M3")) {
            tvInfo.setText("Module code: C206 \nModule Name: Software Development Process \nAcademic Year: 2023 \nSemester: 1 \nModule Credit: 4 \nVenue: W64P");
        } else if (moduleSelected.equals("M4")) {
            tvInfo.setText("Module code: C203 \nModule Name: Web Appln Development in php \nAcademic Year: 2023 \nSemester: 1 \nModule Credit: 4 \nVenue: W64P");
        } else if (moduleSelected.equals("M5")) {
            tvInfo.setText("Module code: C218 \nModule Name: UI/UX Design for Apps \nAcademic Year: 2023 \nSemester: 1 \nModule Credit: 4 \nVenue: W64P");
        }
    }
}