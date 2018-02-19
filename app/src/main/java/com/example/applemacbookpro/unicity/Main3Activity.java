package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;
import static com.example.applemacbookpro.unicity.R.drawable.button;

public class Main3Activity extends AppCompatActivity {
    String idNumber="1234";
    String password="1234";
    Button login;
    EditText id,passwrd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        id = (EditText) findViewById(R.id.id);
        passwrd = (EditText) findViewById(R.id.passwrd);

        idNumber = id.getText().toString().trim();
        password = passwrd.getText().toString().trim();


    }



    public void onclicklogo(View view)
    {


        if ( password.equals(passwrd)&&idNumber.equals(id))
        {
            Toast.makeText(Main3Activity.this, "Invalid credentials",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(Main3Activity.this, "Login Successful!!",Toast.LENGTH_LONG).show();
            Intent y = new Intent(this, Main14Activity.class);
            startActivity(y);
            }

    }
}




