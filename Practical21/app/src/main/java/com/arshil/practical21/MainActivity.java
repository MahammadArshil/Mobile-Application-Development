package com.arshil.practical21;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends Activity {
    EditText et_phone;
    Button btn_save,btn_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_call=(Button) findViewById(R.id.btn_call);
        btn_save=(Button) findViewById(R.id.btn_save);
        et_phone=(EditText) findViewById(R.id.et_phone);
        String phone=et_phone.getText().toString();
//        int Phone=Integer.parseInt(phone);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Phone Number '"+phone+"' saved successfully.", Toast.LENGTH_SHORT).show();
            }
        });
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Now Calling :"+phone, Toast.LENGTH_SHORT).show();
                Uri u = Uri.parse("tel:" + phone);
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                try {
                    startActivity(i);
                }
                catch (SecurityException s) {
                    Toast.makeText(MainActivity.this, "An Error Occured!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}