package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
public void onclickstu(View view){
    Intent s=new Intent(this,Main2Activity.class);
startActivity(s);
}
    public void onclickfac(View view){
        Intent t=new Intent(this,Main12Activity.class);
        startActivity(t);
    }
    public void onclickadm(View view){
        Intent u=new Intent(this,Main13Activity.class);
        startActivity(u);
    }
}
