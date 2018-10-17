package com.example.desarrollo4.test1.screen.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;
import com.example.desarrollo4.test1.R;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityMovimientoFragment.HomeActivityMovimientoFragment;
import com.example.desarrollo4.test1.screen.home.fragments.HomeActivityDibujooFragment.HomeActivityDibujoFragment;

public class HomeActivityPageAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

    private static int NUM_PAGINAS = 2;
    private int tabIcons[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    public HomeActivityPageAdapter(FragmentManager fm) { super(fm); }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return HomeActivityMovimientoFragment.newInstance(0,"Movimiento");
            case 1:
                return HomeActivityDibujoFragment.newInstance(1,"Sensor");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGINAS;
    }

    @Override
    public int getPageIconResId(int position) {
        return tabIcons[position];
    }
}
