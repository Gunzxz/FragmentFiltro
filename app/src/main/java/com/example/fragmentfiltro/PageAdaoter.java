package com.example.fragmentfiltro;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class PageAdaoter extends FragmentPagerAdapter {

    private int numofTabs;

    public PageAdaoter(@NonNull FragmentManager fm, int numofTabs) {
        super(fm);
        this.numofTabs = numofTabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:

                 return new tab1();
            case 1:
                return new tab2();

            default:
                return null;




        }


    }

    @Override
    public int getCount() {
        return numofTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
