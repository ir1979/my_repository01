package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class CalculatorActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btnClear, btnExe, btnAdd;
    TextView txtResult;
    EditText txtCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnClear = findViewById(R.id.btnClear);
        btnAdd = findViewById(R.id.btnAdd);
        btnExe = findViewById(R.id.btnExe);

        txtResult = findViewById(R.id.txtResult);
        txtCalc = findViewById(R.id.txtEdit);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCalc.setText(txtCalc.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtCalc.setText(txtCalc.getText().toString() + "1");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCalc.setText(txtCalc.getText().toString() + "+");
            }
        });

        btnExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression e = new Expression(txtCalc.getText().toString());
                txtResult.setText(String.valueOf(e.calculate()));
            }
        });

    }
}