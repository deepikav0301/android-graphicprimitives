package com.example.graphicsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Transformation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformation);
        ImageView image=findViewById(R.id.amongus_image);
        image.setImageResource(0);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable =getResources().getDrawable(R.drawable.among_us);
        drawable=(drawable);
        image.setImageDrawable(drawable);
        Button rotate=findViewById(R.id.rotate_button);
        final float[] angle = {90.0f};
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setRotation(angle[0]);
                angle[0] +=90;
            }
        });
        float x =image.getScaleX();
        float y =image.getScaleY();
        Button zoom_in = findViewById(R.id.zoomin_button);
        zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x =image.getScaleX();
                float y =image.getScaleY();
                image.setScaleX((float) (x+0.5));
                image.setScaleY((float) (y+0.5));
            }
        });
        Button zoom_out = findViewById(R.id.zoomout_button);
        zoom_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x =image.getScaleX();
                float y =image.getScaleY();
                image.setScaleX((float) (x-0.5));
                image.setScaleY((float) (y-0.5));
            }
        });
    }
}