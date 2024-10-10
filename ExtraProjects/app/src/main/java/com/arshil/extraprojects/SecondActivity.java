package com.arshil.extraprojects;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView name=(TextView) findViewById(R.id.txt_Name);
        TextView email=(TextView) findViewById(R.id.txt_Email);
        TextView phone=(TextView) findViewById(R.id.txt_Phone);

        Bundle bd=getIntent().getExtras();
        name.setText(bd.getString("name"));
        email.setText(bd.getString("email"));
        phone.setText(bd.getString("phone"));
    }
}
