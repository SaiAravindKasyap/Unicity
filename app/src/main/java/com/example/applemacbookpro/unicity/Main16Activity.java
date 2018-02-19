package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }
    public void onclickhome(View view){
        Intent c=new Intent(this,Admin_profile_page.class);
        startActivity(c);
    }
    public void onclickbus(View view){
        Intent f=new Intent(this,Main19Activity.class);
        startActivity(f);

    }
}
