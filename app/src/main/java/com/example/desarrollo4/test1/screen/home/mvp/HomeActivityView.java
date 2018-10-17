package com.example.desarrollo4.test1.screen.home.mvp;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.support.v7.widget.Toolbar;

import com.astuetz.PagerSlidingTabStrip;
import com.example.desarrollo4.test1.R;
import com.example.desarrollo4.test1.screen.home.HomeActivityPageAdapter;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import butterknife.ButterKnife;
import io.reactivex.Observable;

public class HomeActivityView extends FrameLayout {

    private HomeActivityPageAdapter homeActivityPageAdapter;
    private Toolbar tBarHomeAcitivity;
    private ViewPager viewPagerHomeActivity;
    private PagerSlidingTabStrip pagerSlidingTabStripHomeActivity;


    public HomeActivityView(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);

        inflate(getContext(), R.layout.activity_home, this);

        homeActivityPageAdapter = new HomeActivityPageAdapter(appCompatActivity.getSupportFragmentManager());
        viewPagerHomeActivity = findViewById(R.id.home_activity_view_pager);
        tBarHomeAcitivity = findViewById(R.id.activity_home_toolbar);
        viewPagerHomeActivity.setAdapter(homeActivityPageAdapter);

        pagerSlidingTabStripHomeActivity = findViewById(R.id.home_activity_pager_tab_strip);
        pagerSlidingTabStripHomeActivity.setUnderlineColor(Color.TRANSPARENT);
        pagerSlidingTabStripHomeActivity.setViewPager(viewPagerHomeActivity);
    }

    public Toolbar getToolbar() {
        return tBarHomeAcitivity;
    }
}
