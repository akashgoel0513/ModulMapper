package com.example.modulmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class dashboard extends AppCompatActivity {

    ImageView logosplash;
    Animation frombottom;
    LinearLayout menuitems;

    Button btn_web, btn_networking, btn_database, btn_software;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_database = (Button)findViewById(R.id.btn_database);
        btn_networking = (Button)findViewById(R.id.btn_networking);
        btn_software = (Button)findViewById(R.id.btn_software);
        btn_web = (Button)findViewById(R.id.btn_web);

        btn_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, database.class);
                startActivity(i);
            }
        });
        btn_networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, networking.class);
                startActivity(i);
            }
        });
        btn_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, software.class);
                startActivity(i);
            }
        });
        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashboard.this, web.class);
                startActivity(i);
            }
        });

        logosplash = (ImageView)findViewById(R.id.logosplash);
        menuitems = (LinearLayout)findViewById(R.id.menuitems);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        logosplash.animate().translationY(-650).setDuration(800).setStartDelay(600);
        menuitems.startAnimation(frombottom);
    }
}
