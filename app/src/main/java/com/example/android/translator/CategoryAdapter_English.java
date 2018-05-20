package com.example.android.translator;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Simratpal Singh on 4/1/2017.
 */

public class CategoryAdapter_English extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter_English(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new NumbersFragment_English();
        } else {
            return new EnglishToHindiFragment();

        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);

        } else {

            return mContext.getString(R.string.category_alphabets);

        }

    }

    @Override
    public int getCount() {
        return 2;
    }


}
