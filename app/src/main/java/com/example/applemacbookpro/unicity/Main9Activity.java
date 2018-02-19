package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void onclickl(View view){
        Intent y=new Intent(this,Main15Activity.class);
        startActivity(y);
    }

}
