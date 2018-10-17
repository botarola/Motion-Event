package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desarrollo4.test1.EXT.baseinterfaces.BaseFragmentInterface;
import com.example.desarrollo4.test1.app.util.AppController;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.dagger.DaggerHomeActivityMovimientoFragmentComponent;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.dagger.HomeActivityMovimientoFragmentModule;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp.HomeActivityMovimientoFragmentPresenter;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.mvp.HomeActivityMovimientoFragmentView;

import javax.inject.Inject;

public class HomeActivityMovimientoFragment extends Fragment implements BaseFragmentInterface {

    @Inject
    HomeActivityMovimientoFragmentView view;

    @Inject
    HomeActivityMovimientoFragmentPresenter presenter;

    private String tituloFragment;
    private int paginaFragment;

    public static HomeActivityMovimientoFragment newInstance(int paginaFragment, String tituloFragment){
        HomeActivityMovimientoFragment fragment = new HomeActivityMovimientoFragment();
        Bundle args= new Bundle();
        args.putInt("paginaFragment",paginaFragment);
        args.putString("tituloFragment",tituloFragment);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        paginaFragment = getArguments().getInt("paginaFragment");
        tituloFragment = getArguments().getString("tituloFragment");
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {

        DaggerHomeActivityMovimientoFragmentComponent.builder()
                .appComponent(AppController.get((AppCompatActivity) getActivity()).component())
                .homeActivityMovimientoFragmentModule(new HomeActivityMovimientoFragmentModule(this))
                .build().inject(this);

        presenter.onCreate();

        return view;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        presenter.onDestroy();
    }
}
