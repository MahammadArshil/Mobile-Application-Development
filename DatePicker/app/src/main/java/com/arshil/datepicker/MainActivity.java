package com.arshil.datepicker;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SimpleAdapter;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button button_1;
    DatePicker datepicker_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker_1=(DatePicker) findViewById(R.id.datepicker_1);
        button_1=(Button) findViewById(R.id.btn_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Date Selected:"+(datepicker_1.getMonth()+1)+"/"+
                        datepicker_1.getDayOfMonth()+"/"+
                        datepicker_1.getYear(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}