package com.example.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void divya(View view) {
        Intent i1= new Intent(LoginActivity.this,TabActivity.class);
        startActivity(i1);
}

    public void varshith(View view) {
        Intent i2=new Intent(LoginActivity.this,GridviewActivity.class);
        startActivity(i2);
    }
}
