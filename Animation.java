package com.example.graphicsapp;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class Animation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        Button play=findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = findViewById(R.id.imageView);
                image.setImageResource(R.drawable.animations);
                AnimationDrawable animation_res=(AnimationDrawable)image.getDrawable();
                animation_res.start();
            }
        });
    }
}