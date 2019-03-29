package com.lvk.convertkmtomiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button buttonConvertMilesToKMs=(Button) findViewById(R.id.buttonMToKM);
        buttonConvertMilesToKMs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles=(EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKMs=(EditText) findViewById(R.id.editTextKilometer);
                double miles=Double.valueOf(textBoxMiles.getText().toString());
                double kms= miles/0.62137;
                DecimalFormat kmsFormat= new DecimalFormat("##.##");
                textBoxKMs.setText(kmsFormat.format(kms));
            }
        });
        Button buttonConvertKmsToMiles=(Button) findViewById(R.id.buttonKmToM);
        buttonConvertKmsToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles=(EditText)findViewById(R.id.editTextMiles);
                EditText textBoxKMs=(EditText) findViewById(R.id.editTextKilometer);
                double kms=Double.valueOf(textBoxKMs.getText().toString());
                double miles= kms*0.62137;
                DecimalFormat milesFormat= new DecimalFormat("##.##");
                textBoxMiles.setText(milesFormat.format(miles));
            }
        });

    }
}
