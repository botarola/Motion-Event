package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.dagger;

import android.support.v4.app.Fragment;

import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp.HomeActivityDibujoFragmentPresenter;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp.HomeActivityDibujoFragmentView;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityDibujoFragmentModule {
    private final Fragment fragment;

    public HomeActivityDibujoFragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @HomeActivityDibujoFragmentScope
    public HomeActivityDibujoFragmentView homeActivitySensorFragmentView(){
        return new HomeActivityDibujoFragmentView(fragment);
    }

    @Provides
    @HomeActivityDibujoFragmentScope
    public HomeActivityDibujoFragmentPresenter homeActivitySensorFragmentPresenter(HomeActivityDibujoFragmentView view){
        return new HomeActivityDibujoFragmentPresenter(view);
    }
}
