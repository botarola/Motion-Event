package com.example.desarrollo4.test1.screen.home.mvp;

import com.example.desarrollo4.test1.EXT.baseinterfaces.BasePresenterInterface;

import io.reactivex.disposables.CompositeDisposable;

public class HomeActivityPresenter implements BasePresenterInterface {

    private final HomeActivityView homeActivityView;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public HomeActivityPresenter(HomeActivityView homeActivityView) {
        this.homeActivityView = homeActivityView;
    }

    public void onCreate(){

    }

    public void onDestroy(){
        compositeDisposable.clear();
    }

}
