package com.example.test03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private List<Student> students;
    private LayoutInflater inflater;

    public StudentAdapter(Context context, List<Student> students) {
        this.students = students;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView = inflater.inflate(R.layout.product, parent, false);
        }

        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtAge = convertView.findViewById(R.id.txtAge);

        Student std = students.get(position);
        txtName.setText(std.getName());
        txtAge.setText(String.valueOf(std.getAge()));

        return convertView;
    }
}
