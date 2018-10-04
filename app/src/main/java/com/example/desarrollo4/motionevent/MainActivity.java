package com.example.desarrollo4.motionevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView tv1;

    private float x;
    private float y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        tv1 = findViewById(R.id.textView);
        escucharBoton();
    }

    private void escucharBoton(){
        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();
                switch (event.getAction()) {

                    case (MotionEvent.ACTION_DOWN):
                        tv1.setText("Pulsación DOWN, \nCordenadas: X:"+ x + ", Y:" + y);
                        break;
                    case (MotionEvent.ACTION_MOVE):
                        tv1.setText("Pulsación MOVE, \nCordenadas: X:" + x + ", Y:" + y);
                        btn1.setX(event.getX()+btn1.getX()-btn1.getWidth()/2);
                        btn1.setY(event.getY()+btn1.getY()-btn1.getHeight()/2);
                        break;
                    case (MotionEvent.ACTION_UP):
                        tv1.setText("Pulsación UP, \nCordenadas: X:" + x + ", Y:" + y);
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

}