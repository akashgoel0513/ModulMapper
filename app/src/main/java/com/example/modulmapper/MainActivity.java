package com.example.modulmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button student_btn, client_btn;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(this);

        student_btn = (Button)findViewById(R.id.student_btn);
        client_btn = (Button)findViewById(R.id.client_btn);

        student_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, studentLogin.class);
                startActivity(i);
            }
        });
        client_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, clientLogin.class);
                startActivity(i);
            }
        });
        db.addCourses();
        db.addNetworkSem1();
        db.addNetworkSem2();
        db.addNetworkSem3();
        db.addNetworkSem4();
        db.addNetworkSem5();
        db.addNetworkSem6();
        db.addDBSem1();
        db.addDBSem2();
        db.addDBSem3();
        db.addDBSem4();
        db.addDBSem5();
        db.addDBSem6();
        db.addWEBSem1();
        db.addWEBSem2();
        db.addWEBSem3();
        db.addWEBSem4();
        db.addWEBSem5();
        db.addWEBSem6();
        db.addSoftwareSem1();
        db.addSoftwareSem2();
        db.addSoftwareSem3();
        db.addSoftwareSem4();
        db.addSoftwareSem5();
        db.addSoftwareSem6();
    }
}
