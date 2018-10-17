package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class HomeActivityMovimientoFragmentPresenter {

    private final HomeActivityMovimientoFragmentView view;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public HomeActivityMovimientoFragmentPresenter(HomeActivityMovimientoFragmentView view) {
        this.view = view;
    }

    public void onCreate(){
        compositeDisposable.add(ejecutar());
    }

    public void onDestroy(){
        compositeDisposable.clear();
    }

    public Disposable ejecutar(){
        return view.obs2().subscribe(__ ->{
            view.escucharBoton("mueveme");
        });
    }
}
