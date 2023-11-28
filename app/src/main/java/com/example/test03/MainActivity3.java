package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView txtView1 = findViewById(R.id.txtView1);
        if (getIntent().getExtras()!=null){
            String name = getIntent().getExtras().getString("Name", "NoName");
            txtView1.setText(name);


        }

    }
}