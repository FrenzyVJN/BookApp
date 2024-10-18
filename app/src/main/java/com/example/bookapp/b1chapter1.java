package com.example.bookapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class b1chapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chapter1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.chapter_1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ConstraintLayout constraintLayout = findViewById(R.id.chapter_1);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(3500);
        animationDrawable.start();
        Button back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            startActivity(new Intent(b1chapter1.this, book1.class));
            finish();
        });
        Button prev1 = findViewById(R.id.prev1);
        prev1.setOnClickListener(v->{
            startActivity(new Intent(b1chapter1.this, book1.class));
            finish();
        });
        Button next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            startActivity(new Intent(b1chapter1.this, b1chapter2.class));
            finish();
        });
    }
}