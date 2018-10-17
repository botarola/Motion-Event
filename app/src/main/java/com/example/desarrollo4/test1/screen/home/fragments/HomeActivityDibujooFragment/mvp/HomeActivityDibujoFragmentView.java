package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.desarrollo4.test1.R;
import com.jakewharton.rxbinding2.view.RxView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;

public class HomeActivityDibujoFragmentView extends FrameLayout {

    @BindView(R.id.botoncitoDibujo)
    Button botoncitoDibujo;

    private Fragment fragment;
    public HomeActivityDibujoFragmentView(Fragment fragment) {
        super(fragment.getActivity());
        this.fragment=fragment;
        inflate(getContext(), R.layout.fragment_home_activity_dibujo, this);
        ButterKnife.bind(this);
    }

    public Observable<Object> dibujar(){
        return RxView.clicks(botoncitoDibujo);
    }

    public void dibujo(Canvas canvas){
        canvas.drawRGB(255,255,255);
        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();

        Paint pincel1 = new Paint();
        pincel1.setARGB(255,200,0,0);
        pincel1.setStrokeWidth(5);
        pincel1.setStyle(Paint.Style.STROKE);
        RectF rectangulo1 = new RectF(0,0,ancho,alto);
        canvas.drawOval(rectangulo1,pincel1);

        int menor;
        if(ancho < alto)
            menor = ancho;
        else
            menor = alto;

        pincel1.setStyle(Paint.Style.FILL);
        pincel1.setARGB(255,255,255,0);
        canvas.drawCircle(ancho/2, alto/2, menor/2, pincel1);
    }

    }

