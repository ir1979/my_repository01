package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class RelativeLayoutActivity extends AppCompatActivity {


    private static final String TAG = "MyTag";
    int x = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        int x = 5;
        Log.i(TAG, "x = " + this.x);
    }
}