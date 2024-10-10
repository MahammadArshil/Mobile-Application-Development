package com.arshil.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox objandroid, objjava, objphp, objpython, objunity3d;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objjava = (CheckBox) findViewById(R.id.ch_1);
        objjava.setOnClickListener(this);
        objandroid = (CheckBox) findViewById(R.id.ch_3);
        objandroid.setOnClickListener(this);
        objphp = (CheckBox) findViewById(R.id.ch_2);
        objphp.setOnClickListener(this);
        objpython = (CheckBox) findViewById(R.id.ch_4);
        objpython.setOnClickListener(this);
        objunity3d = (CheckBox) findViewById(R.id.ch_5);
        objunity3d.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        boolean checked=((CheckBox)v).isChecked();
        if(objjava.isChecked())
        {
            result=objjava.getText().toString();
        }
        if(objandroid.isChecked())
        {
            result=objandroid.getText().toString();
        }
        if(objphp.isChecked())
        {
            result=objphp.getText().toString();
        }
        if(objpython.isChecked())
        {
            result=objpython.getText().toString();
        }
        if(objunity3d.isChecked())
        {
            result=objunity3d.getText().toString();
        }
        Toast.makeText(this, result.toString()+" Selected", Toast.LENGTH_SHORT).show();
    }
}