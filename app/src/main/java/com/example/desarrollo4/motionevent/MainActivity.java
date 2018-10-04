package com.example.desarrollo4.motionevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private Button btn1;
    private TextView tv1;

    private int x;
    private int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnTouchListener(this);
        tv1 = findViewById(R.id.textView);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = (int)event.getX();
        y = (int)event.getY();
        switch (event.getAction()) {

            case (MotionEvent.ACTION_DOWN):
                tv1.setText("Pulsación DOWN, \nCordenadas: X:"+ x + ", Y:" + y);
                break;
            case (MotionEvent.ACTION_MOVE):
                tv1.setText("Pulsación MOVE, \nCordenadas: X:" + x + ", Y:" + y);
                break;
            case (MotionEvent.ACTION_UP):
                tv1.setText("Pulsación UP, \nCordenadas: X:" + x + ", Y:" + y);
                break;
            default:

                break;


        }
        return true;
    }

}