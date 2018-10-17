package com.example.desarrollo4.test1.app.util;

import android.app.Application;
import android.app.Service;
import android.support.v7.app.AppCompatActivity;

import com.example.desarrollo4.test1.app.dagger.AppComponent;
import com.example.desarrollo4.test1.app.dagger.AppModule;
import com.example.desarrollo4.test1.app.dagger.DaggerAppComponent;
import com.squareup.leakcanary.LeakCanary;

public class AppController extends Application {

    private AppComponent appComponent;

    public static AppController get(AppCompatActivity appCompatActivity) {
        return (AppController) appCompatActivity.getApplication();
    }

    public static AppController get(Service service) {
        return (AppController) service.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();


    }

    public AppComponent component() {
        return appComponent;
    }

}
