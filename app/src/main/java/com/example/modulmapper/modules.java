package com.example.modulmapper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class modules extends AppCompatActivity {

    String pathway;
    String admin;
    Module module = new Module();
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Bundle data = getIntent().getExtras();
        if(data==null){
            return;
        }

        admin = data.getString("admin");
        pathway = data.getString("pathway");

        TextView pathwayTitle = findViewById(R.id.pathwayTitle);
        pathwayTitle.setText(pathway);

        if (pathway == "software") {

            module = db.getModule("SOFTWARE_ENGINEERING_SEM_1");

        } else if (pathway == "network") {

            module = db.getModule("NETWORK_ENGINEERING_SEM_1");

        } else if (pathway == "web") {

            module = db.getModule("WEB_DEVELOPMENT_SEM_1");

        } else if (pathway == "database") {

            module = db.getModule("DATABASE_ARCHITECTURE_SEM_1");

        }

        TextView moduleTitle1 = findViewById(R.id.moduleTitle1);
        moduleTitle1.setText(module.get_moduleTitle());

        /*TextView moduleTitle2 = findViewById(R.id.moduleTitle2);
        moduleTitle2.setText(moduleTitles.get(1));
        TextView moduleTitle3 = findViewById(R.id.moduleTitle3);
        moduleTitle3.setText(moduleTitles.get(2));
        TextView moduleTitle4 = findViewById(R.id.moduleTitle4);
        moduleTitle4.setText(moduleTitles.get(3));
        TextView moduleTitle5 = findViewById(R.id.moduleTitle5);
        moduleTitle5.setText(moduleTitles.get(4));
        TextView moduleTitle6 = findViewById(R.id.moduleTitle6);
        moduleTitle6.setText(moduleTitles.get(5));
        TextView moduleTitle7 = findViewById(R.id.moduleTitle7);
        moduleTitle7.setText(moduleTitles.get(6));
        TextView moduleTitle8 = findViewById(R.id.moduleTitle8);
        moduleTitle8.setText(moduleTitles.get(7));*/

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

}
