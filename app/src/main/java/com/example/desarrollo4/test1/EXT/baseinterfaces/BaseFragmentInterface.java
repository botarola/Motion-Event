package com.example.desarrollo4.test1.EXT.baseinterfaces;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface BaseFragmentInterface {

    void onCreate(Bundle savedInstanceState);
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState);
    public void onDestroy();

}
