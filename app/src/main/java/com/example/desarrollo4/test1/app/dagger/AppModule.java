package com.example.desarrollo4.test1.app.dagger;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Context context;

    public AppModule(Application application) {
        this.context = application.getApplicationContext();
    }

    @Provides
    @AppScope
    public Context context(){
        return context;
    }
}
