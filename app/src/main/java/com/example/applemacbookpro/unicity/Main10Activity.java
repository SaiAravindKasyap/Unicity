package com.example.applemacbookpro.unicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void onclicklo(View view){
        Intent z=new Intent(this,Main16Activity.class);
        startActivity(z);
    }
}
