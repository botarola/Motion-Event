package com.example.desarrollo4.test1.screen.home.dagger;

import android.support.v7.app.AppCompatActivity;

import com.example.desarrollo4.test1.screen.home.mvp.HomeActivityPresenter;
import com.example.desarrollo4.test1.screen.home.mvp.HomeActivityView;
import com.mikepenz.materialdrawer.DrawerBuilder;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {
    private final AppCompatActivity appCompatActivity;

    public HomeActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides
    @HomeActivityScope
    public HomeActivityView homeActivityView(){
        return new HomeActivityView(appCompatActivity);
    }

    @Provides
    @HomeActivityScope
    public HomeActivityPresenter homeActivityPresenter(HomeActivityView view){
        return new HomeActivityPresenter(view);
    }

}
