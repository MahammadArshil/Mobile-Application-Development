package com.arshil.calenderview;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CalendarView calender_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calender_view=(CalendarView) findViewById(R.id.calender_View);
        calender_view.setFocusedMonthDateColor(Color.RED);
        calender_view.setUnfocusedMonthDateColor(Color.BLUE);
        calender_view.setSelectedWeekBackgroundColor(Color.RED);
        calender_view.setWeekSeparatorLineColor(Color.GREEN);

        calender_view.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity.this, dayOfMonth+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
            }
        });
    }
}