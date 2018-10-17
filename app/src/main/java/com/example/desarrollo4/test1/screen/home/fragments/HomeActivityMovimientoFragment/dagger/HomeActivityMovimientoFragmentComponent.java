package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.dagger;

import com.example.desarrollo4.test1.app.dagger.AppComponent;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.HomeActivityMovimientoFragment;

import dagger.Component;

@HomeActivityMovimientoFragmentScope
@Component(modules = {HomeActivityMovimientoFragmentModule.class}, dependencies = {AppComponent.class})
public interface HomeActivityMovimientoFragmentComponent {

    void inject(HomeActivityMovimientoFragment fragment);
}
