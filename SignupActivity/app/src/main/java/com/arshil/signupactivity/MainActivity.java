package com.arshil.signupactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn_Submit;
    EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Submit=(Button) findViewById(R.id.btn_Submit);
        Username=(EditText) findViewById(R.id.et_username);
        Password=(EditText) findViewById(R.id.et_password);

        String U_name=Username.getText().toString();
        String U_pass=Password.getText().toString();

        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_login);
                Bundle onjBundle=new Bundle();
                onjBundle.putString("User_Name",U_name);
                onjBundle.putString("User_Password",U_pass);

                Intent i=new Intent(getApplicationContext(), LoginActivity.class);
                i.putExtra("data",onjBundle);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Sign Up Completed."+U_name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}