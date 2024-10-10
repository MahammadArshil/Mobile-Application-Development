package com.arshil.radiogroup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    RadioButton captainAmerica, thor, ironMan, blackWidow, hulk, hawkeye;
    Button submit;
    String selectCharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        captainAmerica=(RadioButton) findViewById(R.id.rdb_1);
        thor=(RadioButton) findViewById(R.id.rdb_2);
        ironMan=(RadioButton) findViewById(R.id.rdb_3);
        blackWidow=(RadioButton) findViewById(R.id.rdb_4);
        hulk=(RadioButton) findViewById(R.id.rdb_5);
        hawkeye=(RadioButton) findViewById(R.id.rdb_6);
        submit=(Button) findViewById(R.id.btn_1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(captainAmerica.isChecked()){
                    selectCharacter=captainAmerica.getText().toString();
                }
                else if(thor.isChecked()){
                    selectCharacter=thor.getText().toString();
                }
                else if(ironMan.isChecked()){
                    selectCharacter=ironMan.getText().toString();
                }
                else if(blackWidow.isChecked()){
                    selectCharacter=blackWidow.getText().toString();
                }
                else if(hulk.isChecked()){
                    selectCharacter=hulk.getText().toString();
                } else if (hawkeye.isChecked()) {
                    selectCharacter=hawkeye.getText().toString();
                }
                Toast.makeText(MainActivity.this, selectCharacter, Toast.LENGTH_SHORT).show();
            }
        });
    }
}