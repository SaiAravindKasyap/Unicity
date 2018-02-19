package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class profile_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }
    public void onclickpicture(View view){
        Intent p=new Intent(this,Swipeactivity.class);
        startActivity(p);
    }
    public void onclicksearch(View view){
        Intent q=new Intent(this,searchActivity.class);
        startActivity(q);
    }
}

