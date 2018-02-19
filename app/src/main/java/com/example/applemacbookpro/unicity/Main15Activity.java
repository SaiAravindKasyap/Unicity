package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }
    public void onclickhom(View view){
        Intent b=new Intent(this,faculty_profile_page.class);
        startActivity(b);
    }
    public void onclickbu(View view){
        Intent e=new Intent(this,Main19Activity.class);
        startActivity(e);
    }
}
