package com.arshil.autocompletetextview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String []countryName={"India","China","America","London","New Zealand","Japan","Dubai"};
    AutoCompleteTextView autotextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autotextview=(AutoCompleteTextView) findViewById(R.id.autotxt_1);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,countryName);
        autotextview.setAdapter(adapter);
        autotextview.setThreshold(3);
    }
}