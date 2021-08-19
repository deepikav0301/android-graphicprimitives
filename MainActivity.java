package com.example.graphicsapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ps=findViewById(R.id.primitive);
        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Shapes.class);
                startActivity(intent);
            }
        });
        Button animationBtn=findViewById(R.id.animation_btn);
        animationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Animation.class);
                startActivity(intent);
            }
        });
        Button transformationBtn = findViewById(R.id.transformBtn);
        transformationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Transformation.class);
                startActivity(intent);
            }
        });
        Button car = findViewById(R.id.car_btn);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CarAnimation.class);
                startActivity(intent);
            }
        });
    }
}