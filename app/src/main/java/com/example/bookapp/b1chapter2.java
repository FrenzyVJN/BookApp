package com.example.bookapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class b1chapter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chapter2);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
        Button back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(b1chapter2.this, book1.class);
            startActivity(intent);
            finish();
        });
        Button prev = findViewById(R.id.prev);
        prev.setOnClickListener(v -> {
            Intent intent = new Intent(b1chapter2.this, b1chapter1.class);
            startActivity(intent);
            finish();
        });

    }
}