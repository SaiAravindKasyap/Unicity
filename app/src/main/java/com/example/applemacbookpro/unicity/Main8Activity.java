package com.example.applemacbookpro.unicity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void onclickstudent(View view){
        Intent p=new Intent(this,Main3Activity.class);
        startActivity(p);
    }
    public void onclickfaculty(View view){
        Intent q=new Intent(this,Main9Activity.class);
        startActivity(q);
    }
    public void onclickadmin(View view){
        Intent r=new Intent(this,Main10Activity.class);
        startActivity(r);
    }
}


