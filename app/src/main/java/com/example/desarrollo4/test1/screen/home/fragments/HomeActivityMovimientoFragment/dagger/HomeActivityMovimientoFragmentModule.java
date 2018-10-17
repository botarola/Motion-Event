package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.dagger;

import android.support.v4.app.Fragment;

import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp.HomeActivityMovimientoFragmentPresenter;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp.HomeActivityMovimientoFragmentView;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityMovimientoFragmentModule {
    private final Fragment fragment;
    public HomeActivityMovimientoFragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @HomeActivityMovimientoFragmentScope
    public HomeActivityMovimientoFragmentView homeActivityMovimientoFragmentView(){
        return new HomeActivityMovimientoFragmentView(fragment);
    }

    @Provides
    @HomeActivityMovimientoFragmentScope
    public HomeActivityMovimientoFragmentPresenter homeActivityMovimientoFragmentPresenter(HomeActivityMovimientoFragmentView view){
        return new HomeActivityMovimientoFragmentPresenter(view);
    }
}
