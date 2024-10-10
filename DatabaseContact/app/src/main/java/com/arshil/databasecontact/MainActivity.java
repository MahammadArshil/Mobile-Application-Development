package com.arshil.databasecontact;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBAdapter db = new DBAdapter(this);
        //Display Data
        db.open();
        Cursor C1 = db.getAllData();
        if (C1.getCount() > 0) {
            C1.moveToFirst();
            do {
                DisplayData(C1);
            } while (C1.moveToNext());
            db.close();
        }
    }

    public void DisplayData(Cursor C2) {
        Toast.makeText(this,"ID:" + C2.getString(0) + "\n"+ "Name:" + C2.getString(1) + "\n" + "Email:" + C2.getString(2), Toast.LENGTH_SHORT).show();
    }
//        //Add contact
////        db.open();
////        long id=db.insertContact("Mahammad Arshil","arshil@gmail.com");
////        id=db.insertContact("Arshil","arshil07@gmail.com");
////        db.close();


}

