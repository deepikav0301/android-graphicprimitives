package com.example.graphicsapp;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class Shapes extends AppCompatActivity {
    Bitmap bg;
    ImageView image;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        bg = Bitmap.createBitmap(720,1280,Bitmap.Config.RGB_565);
        image=findViewById(R.id.box);
        image.setImageBitmap(bg);
        Canvas canvas =new Canvas(bg);
        Paint paint = new Paint();
        paint.setTextSize(46);
        canvas.drawColor(Color.WHITE);
        //circle
        paint.setColor(Color.BLACK);
        canvas.drawText("CIRCLE",120,150,paint);
        paint.setColor(Color.parseColor("#F49507"));
        canvas.drawCircle(200,350,150,paint);
        //arc
        paint.setColor(Color.BLACK);
        canvas.drawText("ARC",430,800,paint);
        paint.setColor(Color.parseColor("#FFE607"));
        canvas.drawArc(410,900,600,1000,0,220,true,paint);
        //rectangle
        paint.setColor(Color.BLACK);
        canvas.drawText("RECTANGLE",105,800,paint);
        paint.setColor(Color.parseColor("#F407F0"));
        canvas.drawRect(50,900,350,1200,paint);
        //line
        paint.setColor(Color.BLACK);
        canvas.drawText("LINE",430,150,paint);
        paint.setColor(Color.parseColor("#000000"));
        canvas.drawLine(520,200,520,600,paint);



    }
}