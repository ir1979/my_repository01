package com.example.test03;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences pref = getSharedPreferences("myPref", MODE_PRIVATE);
        int i = pref.getInt("txtNumber", 0);
        EditText edtTxt = findViewById(R.id.edtNumber);
        edtTxt.setText(String.valueOf(i));



        Button btn1 = findViewById(R.id.btnCalculator);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calcIntent);
            }
        });

        Button btnStudentList = findViewById(R.id.btnStudentsList);

        btnStudentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stdIntent = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(stdIntent);
            }
        });

        Button btnStudents2List = findViewById(R.id.btnStudents2List);
        btnStudents2List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productIntent = new Intent(MainActivity.this,
                        Student2Activity.class);
                startActivity(productIntent);
            }
        });


        Button btnProductList = findViewById(R.id.btnProductsList);
        btnProductList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productIntent = new Intent(MainActivity.this,
                        ProductActivity.class);
                startActivity(productIntent);
            }
        });


        Button btnFatemeh, btnHasan;
        btnFatemeh = findViewById(R.id.btnFatemeh);
        btnHasan = findViewById(R.id.btnHasan);

        btnFatemeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MainActivity3.class);
                it.putExtra("Name", "Fatemeh");
                startActivity(it);
            }
        });

        btnHasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MainActivity3.class);
                it.putExtra("Name", "Hasan");
                startActivity(it);
            }
        });


        ArrayList<String> students = new ArrayList<>();
        students.add("Ali");
        students.add("Hasan");
        students.add("Hossein");

        ListView lst3 = findViewById(R.id.lstView3);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.mehrabi_layout, students);

        lst3.setAdapter(adapter);

        lst3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView txtv = (TextView) view;
                String name = txtv.getText().toString();
                // Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                Intent it = new Intent(MainActivity.this, MainActivity3.class);
                it.putExtra("Name", name);
                startActivity(it);
            }
        });


        Button btnAddName = findViewById(R.id.btnAddName);
        btnAddName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                students.add("Zahra");
                //students.remove(students.size()-1);
                adapter.notifyDataSetChanged();
            }
        });

        AlertDialog.Builder bl = new AlertDialog.Builder(this);

        bl.setTitle("Are you sure?")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "ممنون از شما", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "از شما انتظار نداشتم.", Toast.LENGTH_SHORT).show();
                    }
                }).setNeutralButton("بیخیال", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "باشه", Toast.LENGTH_SHORT).show();
                    }
                }).create().show();




            lst3.setLongClickable(true);
        lst3.setClickable(true);
            lst3.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    TextView tv = (TextView) view;
                    String name = tv.getText().toString();

                    int i = students.indexOf(name);
                    Toast.makeText(MainActivity.this, i+"", Toast.LENGTH_SHORT).show();

                    return true;
                }
            });



        Button btnAdder = findViewById(R.id.btnAdder);
        btnAdder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent it = new Intent(MainActivity.this, ActivityAdder.class);
                EditText edtNumber = findViewById(R.id.edtNumber);
                int number = Integer.parseInt(edtNumber.getText().toString());
                it.putExtra("Number", number);

                SharedPreferences pref = getSharedPreferences("myPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("txtNumber", number);
                editor.apply();

                Toast.makeText(MainActivity.this, pref.getInt("txtNumber", 0) + "", Toast.LENGTH_SHORT).show();

                startActivityForResult(it, 555);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==555 && resultCode==RESULT_OK) {
            int returnValue = data.getExtras().getInt("Computed");
            Toast.makeText(this, returnValue + "", Toast.LENGTH_LONG).show();

            AlertDialog.Builder bl = new AlertDialog.Builder(this)
                    .setTitle("The result" + returnValue)
                    .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                        }
                    });

            bl.create().show();


        }


    }
}