package com.arshil.temparatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et_celsius,et_fahrenheit,et_kelvin;
    Button btn_convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_celsius=findViewById(R.id.et_celcius);
        et_fahrenheit=findViewById(R.id.et_fahrenheit);
        et_kelvin=findViewById(R.id.et_kelvin);

        btn_convert=findViewById(R.id.btn_convert);
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double celsius=Integer.parseInt(et_celsius.getText().toString());
                double fahrenheit=Integer.parseInt(et_fahrenheit.getText().toString());
                double kelvin=Integer.parseInt(et_kelvin.getText().toString());
                if(celsius!=0){
                    fahrenheit=1.8*(celsius)+32;
                    kelvin=celsius+273.15;
                    String temp=String.valueOf(fahrenheit);
                    String temp_1=String.valueOf(kelvin);
                    et_fahrenheit.setText(temp);
                    et_kelvin.setText(temp_1);
                }
                else if(fahrenheit!=0){
                   celsius=(fahrenheit-32)/(1.8);
                   kelvin=celsius+273.15;
                   String temp=String.valueOf(celsius);
                   String temp_1=String.valueOf(kelvin);
                   et_celsius.setText(temp);
                   et_kelvin.setText(temp_1);
                } else if (kelvin!=0) {
                    celsius=kelvin-273.15;
                    fahrenheit=1.8*(celsius)+32;
                    String temp=String.valueOf(celsius);
                    String temp_1=String.valueOf(fahrenheit);
                    et_celsius.setText(temp);
                    et_fahrenheit.setText(temp_1);
                }
                else{
                    Toast.makeText(MainActivity.this, "Enter any one Value..", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}