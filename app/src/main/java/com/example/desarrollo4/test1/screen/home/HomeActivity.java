package com.example.desarrollo4.test1.screen.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.desarrollo4.test1.app.util.AppController;
import com.example.desarrollo4.test1.screen.home.dagger.DaggerHomeActivityComponent;
import com.example.desarrollo4.test1.screen.home.dagger.HomeActivityModule;
import com.example.desarrollo4.test1.screen.home.mvp.HomeActivityPresenter;
import com.example.desarrollo4.test1.screen.home.mvp.HomeActivityView;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity {

    @Inject
    HomeActivityView homeActivityView;

    @Inject
    HomeActivityPresenter homeActivityPresenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerHomeActivityComponent.builder()
                .appComponent(AppController.get(this).component())
                .homeActivityModule(new HomeActivityModule(this))
                .build().inject(this);

        setContentView(homeActivityView);
        homeActivityPresenter.onCreate();


    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        homeActivityPresenter.onDestroy();
    }

}
