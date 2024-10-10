package com.arshil.extraprojects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    EditText Name,Email,Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText) findViewById(R.id.et_Name);
        Email=(EditText) findViewById(R.id.et_Email);
        Phone=(EditText) findViewById(R.id.et_Phone);
    }
    public void onClick(View view){
        Intent intent=new Intent(this,SecondActivity.class);
        Bundle extras =new Bundle();
        extras.putString("name",Name.getText().toString());
        extras.putString("email",Email.getText().toString());
        extras.putString("phone",Phone.getText().toString());
        startActivity(intent,extras);
    }
}