package com.example.android.translator;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Simratpal Singh on 4/1/2017.
 */

public class CategoryAdapter_Hindi extends FragmentPagerAdapter {
    public CategoryAdapter_Hindi(FragmentManager fm) {
        super(fm);

    }
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new NumbersFragment_Hindi();
        } else {
            return new HindiToEnglishFragment();

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "संख्या";


        } else {

            return "अक्षर";

        }

    }


}
