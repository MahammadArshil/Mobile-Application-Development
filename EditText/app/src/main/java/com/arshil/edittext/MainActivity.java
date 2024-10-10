package com.arshil.edittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    Button submit;
    EditText name,password,email,contact,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.et_name);
        password = (EditText) findViewById(R.id.et_pass);
        email = (EditText) findViewById(R.id.et_email);
        date = (EditText) findViewById(R.id.et_date);
        contact = (EditText) findViewById(R.id.et_number);
        submit = (Button) findViewById(R.id.btn_Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty()||password.getText().toString().isEmpty()||
                        email.getText().toString().isEmpty()||
                        date.getText().toString().isEmpty()||
                        contact.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter The Data",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Name -"+name.getText().toString()+"\n"+
                            "Password -"+password.getText().toString()+"\n"+
                            "E-Mail -  " + email.getText().toString() + " \n" +
                            "Date -  " + date.getText().toString()+ " \n" +
                            "Contact -" + contact.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}