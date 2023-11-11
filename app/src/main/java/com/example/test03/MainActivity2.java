package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        EditText edtCalc = findViewById(R.id.edtCalculation);
        TextView txtResult = findViewById(R.id.txtResult2);

        Button btn_0, btn_1, btn_2, btn_3;
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtCalc.getText().toString().equals("0"))
                    edtCalc.setText("0");
                else
                    edtCalc.setText(edtCalc.getText().toString() + "0");
            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtCalc.getText().toString().equals("0"))
                    edtCalc.setText("1");
                else
                    edtCalc.setText(edtCalc.getText().toString() + "1");
            }
        });







    }
}