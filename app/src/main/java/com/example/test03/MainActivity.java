package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button btn1 = findViewById(R.id.btnCalculator);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent calcIntent = new Intent(MainActivity.this, CalculatorActivity.class);
//                startActivity(calcIntent);
//
//            }
//        });



        Button btn2 = findViewById(R.id.btnCalculator2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(it2);
            }
        });





    }
}