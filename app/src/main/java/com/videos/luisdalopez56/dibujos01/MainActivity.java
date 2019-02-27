package com.videos.luisdalopez56.dibujos01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Grafico grafico = new Grafico(this);
        setContentView(grafico);
    }

    private class Grafico extends View {

        public Grafico(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint pincel = new Paint();
            pincel.setColor(Color.CYAN);
            canvas.drawPaint(pincel);

            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            pincel.setColor(Color.BLACK);
            pincel.setTextSize(30);
            pincel.setAntiAlias(true);
            canvas.drawText("ANCHO: "+ ancho + " ," + " ALTO: " + alto, 40,40, pincel);

            pincel.setColor(Color.rgb(100,20,0));
            canvas.drawLine(300, 80, ancho-200, 80, pincel);
            canvas.drawLine(300, 80, 300, alto-200, pincel);
            canvas.drawLine(300, alto/2, ancho/2+200, 935, pincel);





        }
    }

}


