package com.arshil.contact_application;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBAdapter db =new DBAdapter(this);

        //Add Contact to Table
        db.open();
        long id = db.insertContact("Arshil Vahora","arshil@gmail.com");
        id=db.insertContact("Hello","hello@gmail.com");
        id=db.insertContact("demo","demo@gmail.com");
        db.close();
    }
}