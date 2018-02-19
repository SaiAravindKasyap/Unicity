package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
    }
    public void onclickb(View view){
        Intent a=new Intent(this,Main19Activity.class);
        startActivity(a);
    }

    public void onclickho(View view){
        Intent e=new Intent(this,profile_page.class);
        startActivity(e);
    }
}
