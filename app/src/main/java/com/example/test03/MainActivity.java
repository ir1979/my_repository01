package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MyTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Salam, It is starting here... ");

        EditText txtNum1 = findViewById(R.id.txtNum1);
        EditText txtNum2 = findViewById(R.id.txtNum2);
        TextView txtResult2 = findViewById(R.id.txtResult2);

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtNum1.getText().toString());
                int n2 = Integer.parseInt(txtNum2.getText().toString());
                txtResult2.setText(n1+n2+"");
            }
        });




    }


    public void processActivity(View v)
    {
        EditText txtName = findViewById(R.id.txtName);
        EditText txtFamily = findViewById(R.id.txtFamily);
        EditText txtPassword = findViewById(R.id.editTextTextPassword);
        EditText txtEmail = findViewById(R.id.editTextTextEmailAddress);
        TextView txtResult = findViewById(R.id.txtResult);
        CheckBox chkAccept = findViewById(R.id.chkAccept);


        String name = txtName.getText().toString();
        String family = txtFamily.getText() + "";
        String password = txtPassword.getText().toString();
        String email = txtEmail.getText().toString();

        boolean correct = true;
        if (name.equals(""))
        {
            correct = false;
            txtName.setError("لطفا نام را وارد کنید.");
        }

        if (family.length()<=5)
        {
            txtFamily.setError("طول فامیلی باید بیشتر از ۴ باشد.");
            correct = false;
        }

        if (password.contains("1")!=true)
        {
            txtPassword.setError("پسورد باید شامل رقم ۱ باشد");
            correct = false;
        }

        if (email.contains("@")!=true)
        {
            txtEmail.setError("ایمیل نادرست است.");
            correct = false;
        }

        if (chkAccept.isChecked()==false)
        {
            correct = false;
            chkAccept.setError("باید قوانین را بپذیرید.");
        }
        else {
            chkAccept.setError("");
        }

        if (correct==true){

            txtResult.setText("ثبت‌نام شما کامل شد.");

        } else
        {
            Toast.makeText(MainActivity.this,
                    "لطفا مجددا تلاش کنید.",
                    Toast.LENGTH_LONG
                    ).show();
        }



    }




}