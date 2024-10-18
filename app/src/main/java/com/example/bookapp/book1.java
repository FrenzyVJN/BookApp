package com.example.bookapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class book1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
        Button showFirstModalButton = findViewById(R.id.chapter1);
        showFirstModalButton.setOnClickListener(v -> {
            Intent intent = new Intent(book1.this, b1chapter1.class);
            startActivity(intent);
            finish();
        });
    }
}