package com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desarrollo4.test1.EXT.baseinterfaces.BaseFragmentInterface;
import com.example.desarrollo4.test1.app.util.AppController;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.dagger.DaggerHomeActivityDibujoFragmentComponent;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.dagger.HomeActivityDibujoFragmentModule;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp.HomeActivityDibujoFragmentPresenter;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.mvp.HomeActivityDibujoFragmentView;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeActivityDibujoFragment extends Fragment implements BaseFragmentInterface {

    @Inject
    HomeActivityDibujoFragmentView view;

    @Inject
    HomeActivityDibujoFragmentPresenter presenter;

    private String tituloFragment;
    private int paginaFragment;

    public static HomeActivityDibujoFragment newInstance(int paginaFragment, String tituloFragment) {
        HomeActivityDibujoFragment fragment = new HomeActivityDibujoFragment();
        Bundle args = new Bundle();
        args.putInt("paginaFragment",paginaFragment);
        args.putString("tituloFragment", tituloFragment);
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        DaggerHomeActivityDibujoFragmentComponent.builder()
                .appComponent(AppController.get((AppCompatActivity) getActivity()).component())
                .homeActivityDibujoFragmentModule(new HomeActivityDibujoFragmentModule(this))
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
