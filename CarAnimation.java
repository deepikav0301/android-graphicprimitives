package com.example.graphicsapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class CarAnimation extends AppCompatActivity {
    Bitmap bg;
    Integer temp;
    ImageView car;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_animation);
        bg = Bitmap.createBitmap(1050,1280,Bitmap.Config.RGB_565);
        car=findViewById(R.id.car_image);
        car.setImageBitmap(bg);
        Canvas canvas =new Canvas(bg);
        canvas.drawColor(Color.WHITE);
        Paint paint=new Paint();
        //body of the car
        paint.setColor(Color.GREEN);
        canvas.drawRect(80,800,720,1100,paint);
        canvas.drawRect(200,630,600,850,paint);
        //windows
        paint.setColor(Color.YELLOW);
        canvas.drawRect(240,650,370,780,paint);
        canvas.drawRect(440,650,570,780,paint);
        //door
        paint.setColor(Color.BLUE);
        canvas.drawRect(400,630,415,1100,paint);
        //wheels
        paint.setColor(Color.BLACK);
        canvas.drawCircle(200,1100,70,paint);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(600,1100,70,paint);
        ArrayList<Animation> an = new ArrayList<>();
        an.add(AnimationUtils.loadAnimation(this,R.anim.car_movement));
        temp=0;
        Button move_car_btn =findViewById(R.id.move_car);
        move_car_btn.setOnClickListener(v -> {
            car.startAnimation(an.get(temp));
        });
    }
}