package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAdder extends AppCompatActivity {

    private int received = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adder);



        if (getIntent().getExtras()!=null) {
            received = getIntent().getIntExtra("Number", 0);
        }

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int calculated = received+1;
                Intent it2 = new Intent(ActivityAdder.this,
                        MainActivity.class);
                it2.putExtra("Computed", calculated);
                setResult(RESULT_OK, it2);
                finish();
            }
        });


    }
}