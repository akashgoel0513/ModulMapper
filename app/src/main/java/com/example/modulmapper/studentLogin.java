package com.example.modulmapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentLogin extends AppCompatActivity {

    EditText loginStudentID, loginPassword;
    Button login_btn;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        db = new DatabaseHelper(this);
        loginStudentID = (EditText)findViewById(R.id.loginStudentID);
        loginPassword = (EditText)findViewById(R.id.loginPassword);
        login_btn = (Button) findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login_student_ID = loginStudentID.getText().toString();
                String login_password = loginPassword.getText().toString();
                Boolean checkLogin = db.checkLoginDetails(login_student_ID, login_password);
                if(checkLogin == true){
                    Intent i = new Intent(studentLogin.this, dashboard.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
