package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class faculty_profile_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_profile_page);
    }
    public void onclicksear(View view){
        Intent oo=new Intent(this,searchActivity.class);
        startActivity(oo);
    }
}
