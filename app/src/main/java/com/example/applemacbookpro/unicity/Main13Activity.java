package com.example.applemacbookpro.unicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }
    public void onclicks(View view){
        Intent v=new Intent(this,Main10Activity.class);
        startActivity(v);

    }
}
