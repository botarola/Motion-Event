package com.example.desarrollo4.test1.app.dagger;

import android.content.Context;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context context();
}
