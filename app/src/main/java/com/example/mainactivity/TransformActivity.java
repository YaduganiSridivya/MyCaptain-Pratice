package com.example.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TransformActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transform);
    }

    public void start(View view) {
        startActivity(new Intent(TransformActivity.this,GridviewActivity.class));
    }


    public void recycler(View view) {
        startActivity(new Intent(TransformActivity.this,SecondActivity.class));
    }

    public void tab(View view) {
        startActivity(new Intent(TransformActivity.this,TabActivity.class));
    }

    public void tab2(View view) {
        startActivity(new Intent(TransformActivity.this,LoginActivity.class));
    }

    public void Oauth(View view) {

        startActivity(new Intent(TransformActivity.this,OAuthActivity.class));
    }
}
