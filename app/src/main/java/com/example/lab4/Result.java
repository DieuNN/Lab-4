package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView txtResult = findViewById(R.id.txtResult);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("myBundle");

        if(bundle != null) {
            String UCLN = String.valueOf(bundle.getInt("1"));
            String BCNN = String.valueOf(bundle.getInt("2"));

            txtResult.setText("UCLN: " + UCLN +
                    "\n" + "BCNN: " + BCNN);
        }


    }
}