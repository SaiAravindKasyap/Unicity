package com.example.applemacbookpro.unicity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btn = (Button) findViewById(R.id.btn_1);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent myweblink = new Intent(android.content.Intent.ACTION_VIEW);
                myweblink.setData(Uri.parse("http://www.hitam.org/"));
                startActivity(myweblink);
            }
        });


        Button btn2= (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent cbit = new Intent(android.content.Intent.ACTION_VIEW);
                cbit.setData(Uri.parse("http://www.cbit.ac.in/"));
                startActivity(cbit);
            }
        });

        Button btn3= (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent griet = new Intent(android.content.Intent.ACTION_VIEW);
                griet.setData(Uri.parse("http://www.griet.ac.in/"));
                startActivity(griet);
            }
        });


        Button btn4= (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent vasv = new Intent(android.content.Intent.ACTION_VIEW);
                vasv.setData(Uri.parse("http://www.vce.ac.in/"));
                startActivity(vasv);
            }
        });


        Button btn5= (Button) findViewById(R.id.btn_5);
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent snist = new Intent(android.content.Intent.ACTION_VIEW);
                snist.setData(Uri.parse("http://www.sreenidhi.edu.in/"));
                startActivity(snist);
            }
        });


        Button btn6= (Button) findViewById(R.id.btn_6);
        btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent guru = new Intent(android.content.Intent.ACTION_VIEW);
                guru.setData(Uri.parse("http://www.gnithyd.ac.in/"));
                startActivity(guru);
            }
        });


        Button btn7= (Button) findViewById(R.id.btn_7);
        btn7.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent gnit = new Intent(android.content.Intent.ACTION_VIEW);
                gnit.setData(Uri.parse("http://www.gnithyd.ac.in"));
                startActivity(gnit);
            }
        });
         Button btn8= (Button) findViewById(R.id.btn_8);
        btn8.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent iare = new Intent(android.content.Intent.ACTION_VIEW);
                iare.setData(Uri.parse("http://www.iare.ac.in/"));
                startActivity(iare);
            }
        });

        Button btn9= (Button) findViewById(R.id.btn_9);
        btn9.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                Intent mrec = new Intent(android.content.Intent.ACTION_VIEW);
                mrec.setData(Uri.parse("http://www.mrec.ac.in/"));
                startActivity(mrec);
            }
        });
        
        
    }
    

 }