package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class TeenagerHobbie extends AppCompatActivity implements View.OnClickListener {
    ImageButton sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenager_hobbie);

        sign_up = findViewById(R.id.sign_up);
        sign_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == sign_up) {
            Intent i = new Intent(this, NavigationBar.class);
            startActivity(i);
        }
    }
}