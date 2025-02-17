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
        setContentView(R.layout.activity_book1);
        ConstraintLayout constraintLayout = findViewById(R.id.book_1);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
        Button book_1_button = findViewById(R.id.book1btn);
        book_1_button.setOnClickListener(v -> {
            Intent intent = new Intent(book1.this, b1chapter1.class);
            startActivity(intent);
            finish();
        });
        Button book_2_button = findViewById(R.id.book2btn);
        book_2_button.setOnClickListener(v -> {
            Intent intent = new Intent(book1.this, b1chapter2.class);
            startActivity(intent);
            finish();
        });
    }
}