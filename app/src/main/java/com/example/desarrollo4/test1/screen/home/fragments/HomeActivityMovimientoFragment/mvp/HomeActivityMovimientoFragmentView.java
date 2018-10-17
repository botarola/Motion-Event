package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.desarrollo4.test1.R;
import com.jakewharton.rxbinding2.view.RxView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;

public class HomeActivityMovimientoFragmentView extends FrameLayout {
    float ejeX;
    float ejeY;

    @BindView(R.id.botoncito)
    Button botoncito;

    private Fragment fragment;

    public HomeActivityMovimientoFragmentView(Fragment fragment) {
        super(fragment.getActivity());
        this.fragment=fragment;
        inflate(getContext(), R.layout.fragment_home_activity_movimiento, this);
        ButterKnife.bind(this);
    }

    public Observable obs2(){
        return RxView.touches(botoncito);
    }


    @SuppressLint("ClickableViewAccessibility")
    public void escucharBoton (String hola){
        botoncito.setOnTouchListener((v, event) -> {
            ejeX = event.getX();
            ejeY = event.getY();
            switch (event.getAction()){

                case (MotionEvent.ACTION_DOWN):
                    break;
                case (MotionEvent.ACTION_MOVE):
                    botoncito.setX(event.getX()+botoncito.getX()-botoncito.getWidth()/2);
                    botoncito.setY(event.getY()+botoncito.getY()-botoncito.getHeight()/2);
                    botoncito.setText(hola);
                    break;
                case (MotionEvent.ACTION_UP):
                    break;
            }
            return false;
        });
    }
}
