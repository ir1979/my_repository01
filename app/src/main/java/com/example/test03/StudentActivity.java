package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Sarah");
        students.add("Mark");
        students.add("Laura");

        ListView studentListView = findViewById(R.id.student_list);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, students);
        studentListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}