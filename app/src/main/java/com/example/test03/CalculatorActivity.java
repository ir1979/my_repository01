package com.example.test03;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btnClear, btnExe;
    TextView txtResult;
    EditText txtCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btnClear = findViewById(R.id.btnClear);
        btnExe = findViewById(R.id.btnExe);

        txtResult = findViewById(R.id.txtResult);
        txtCalc = findViewById(R.id.txtEdit);

        Resources r = getResources();

        for (int i=0;i<10;i++){
            int currentId = r.getIdentifier("btn"+Integer.toString(i),"id", this.getPackageName());
            Button currentButton = findViewById(currentId);

            final int fi = i;
            currentButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtCalc.setText(txtCalc.getText().toString() + Integer.toString(fi));
                }
            });
        }



    }
}