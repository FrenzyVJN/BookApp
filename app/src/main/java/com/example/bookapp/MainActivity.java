package com.example.bookapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
        Button book_1_button = findViewById(R.id.book1btn);
        book_1_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, book1.class);
            startActivity(intent);
            finish();
        });
        Button book_2_button = findViewById(R.id.book2btn);
        book_2_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, b1chapter2.class);
            startActivity(intent);
            finish();
        });
    }
}