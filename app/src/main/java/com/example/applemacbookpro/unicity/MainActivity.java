package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickregistration(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void onclicklogin(View view){
        Intent j=new Intent(this,Main3Activity.class);
        startActivity(j);

    }

    public void onclickskip(View view){
        Intent k=new Intent(this,Main4Activity.class);
        startActivity(k);
    }

}