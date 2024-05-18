package com.jtdev.rtsm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bldg_main2nd extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bldg_main2ndfloor);

        Button Floor2_1 = findViewById(R.id.Floor1);
        Button Floor2_2 = findViewById(R.id.Floor2_3);
        Floor2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main2nd.this, bldg_main2.class);
                startActivity(intent);
            }
        });

        Floor2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bldg_main2nd.this, bldg_main3rd.class);
                startActivity(intent);
            }
        });
    }}