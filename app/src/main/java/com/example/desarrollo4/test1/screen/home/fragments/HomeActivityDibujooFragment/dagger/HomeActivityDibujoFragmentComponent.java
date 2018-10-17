package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.dagger;

import com.example.desarrollo4.test1.app.dagger.AppComponent;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.HomeActivityDibujoFragment;

import dagger.Component;

@HomeActivityDibujoFragmentScope
@Component(modules = { HomeActivityDibujoFragmentModule.class},dependencies = {AppComponent.class})
public interface HomeActivityDibujoFragmentComponent {
    void inject(HomeActivityDibujoFragment fragment);
}
