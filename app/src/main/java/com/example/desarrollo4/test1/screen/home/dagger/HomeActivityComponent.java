package com.example.desarrollo4.test1.screen.home.dagger;

import com.example.desarrollo4.test1.app.dagger.AppComponent;
import com.example.desarrollo4.test1.screen.home.HomeActivity;

import dagger.Component;

@HomeActivityScope
@Component(modules = {HomeActivityModule.class}, dependencies = {AppComponent.class})
public interface HomeActivityComponent {
    void inject(HomeActivity homeActivity);
}
