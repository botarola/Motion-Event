package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp;

import com.example.desarrollo4.test1.EXT.baseinterfaces.BasePresenterInterface;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class HomeActivityDibujoFragmentPresenter implements BasePresenterInterface {

    private HomeActivityDibujoFragmentView view;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public HomeActivityDibujoFragmentPresenter(HomeActivityDibujoFragmentView view){
        this.view = view;
    }

    @Override
    public void onCreate() {
        compositeDisposable.add(eject());
    }

    @Override
    public void onDestroy() {
        compositeDisposable.clear();
    }

    public Disposable eject(){
        return view.dibujar().subscribe(__ ->{
            view.dibujar();
        });
    }
}

