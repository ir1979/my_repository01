package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Student2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student2);


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John Doe", 20));
        studentList.add(new Student("Jane Smith", 22));


        //RecyclerView rv = findViewById(R.id.rvStudents);
        ListView lstStudents = findViewById(R.id.lstStudents);

        StudentAdapter adapter2 = new StudentAdapter(this, studentList);
        lstStudents.setAdapter(adapter2);

        adapter2.notifyDataSetChanged();

    }
}