package com.arshil.signupactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    Button btn_login;
    EditText et_user,et_pass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        et_user=(EditText) findViewById(R.id.et_username);
        et_pass=(EditText) findViewById(R.id.et_password);
        btn_login=(Button) findViewById(R.id.btn_login);
        String User=et_user.getText().toString();
        String Pass=et_pass.getText().toString();

        Bundle obj_Bundle=getIntent().getBundleExtra("Details");
        String User_old=obj_Bundle.getString("User_Name");
        String Pass_old =obj_Bundle.getString("Password");

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(User.equals(User_old) && Pass.equals(Pass_old)){
                    Toast.makeText(SecondActivity.this, "Login Successful : "+User, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SecondActivity.this, "Wrong User Name or Password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
