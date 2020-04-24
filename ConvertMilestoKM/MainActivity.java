package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonMtoKM);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles = findViewById(R.id.editTextMiles);
                EditText textboxKM = findViewById(R.id.editText2Km);
                double vmiles =  Double.valueOf(textboxMiles.getText().toString());
                double vKM = vmiles/ 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textboxKM.setText(formatVal.format(vKM));

            }
        });
        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonKMtoM);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles = findViewById(R.id.editTextMiles);
                EditText textboxKM = findViewById(R.id.editText2Km);
                double vKM =  Double.valueOf(textboxKM.getText().toString());
                double vmiles = vKM * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textboxMiles.setText(formatVal.format(vmiles));

            }
        });
    }
}
