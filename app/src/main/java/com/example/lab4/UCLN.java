package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UCLN extends AppCompatActivity {
    Button btnCalculate;
    Intent intent;
    Bundle bundle;
    EditText txtVar1, txtVar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucln);

        btnCalculate = findViewById(R.id.btnCalculate);

    }

    public void calculate(View view) {
        txtVar1 = findViewById(R.id.txtVar1);
        txtVar2 = findViewById(R.id.txtVar2);

        try {
            if (txtVar1.getText().length() == 0 || txtVar2.getText().length() == 0) {
                Toast.makeText(getBaseContext(), "Bạn phải nhập vào cả 2 biến!", Toast.LENGTH_SHORT).show();
            } else {
                intent = new Intent(UCLN.this, Result.class);
                bundle = new Bundle();
                bundle.putInt("1", timUCLN(Integer.parseInt(txtVar1.getText().toString()), Integer.parseInt(txtVar2.getText().toString())));
                bundle.putInt("2", timBCNN(Integer.parseInt(txtVar1.getText().toString()), Integer.parseInt(txtVar2.getText().toString())));
                intent.putExtra("myBundle", bundle);


                startActivity(intent);


            }
        } catch (Exception e) {
            Toast.makeText(UCLN.this, "Bạn phải nhập số!", Toast.LENGTH_SHORT).show();
        }
    }


    public int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        return a;
    }

    public int timBCNN(int a, int b) {
        return (a * b) / timUCLN(a, b);
    }
}