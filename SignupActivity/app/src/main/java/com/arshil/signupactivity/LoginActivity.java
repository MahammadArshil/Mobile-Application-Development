package com.arshil.signupactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {
    EditText et_Uname,et_Upass;
    Button btn_Login;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_Uname=(EditText) findViewById(R.id.et_Uname);
        et_Upass=(EditText) findViewById(R.id.et_Pass);
        btn_Login=(Button) findViewById(R.id.btn_login);
        Bundle objbnd=getIntent().getBundleExtra("data");
        String user=objbnd.getString("User_Name");
        String pass=objbnd.getString("User_Password");

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_1=et_Uname.getText().toString();
                String pass_1=et_Upass.getText().toString();

                if(user_1.equals(user) && pass_1.equals(pass)){
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
