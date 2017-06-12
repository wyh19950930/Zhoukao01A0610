package com.bwei.haozi.zhoukao01a0610;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bwei.haozi.zhoukao01a0610.fragment.OneFragment;
import com.bwei.haozi.zhoukao01a0610.fragment.TwoFragment;

/**
 * Created by haozi on 2017/6/10.
 */

public class MainAdapter extends FragmentPagerAdapter {

    String[] TITLE = {"从前","现在","过去","了再","不来","红红","落叶","长埋","尘土","内！"};
    private Fragment fragment;

    public MainAdapter(FragmentManager fm) {
        super(fm);
    }


   /* public MainAdapter(FragmentManager fm) {
        super(fm);
    }*/

    @Override
    public Fragment getItem(int position) {

        fragment = new Fragment();

        switch (position){

            case 0:

                fragment = new OneFragment();

                break;
            case 1:

                fragment = new TwoFragment();

                break;

        }

        return fragment;
    }

    @Override
    public int getCount() {
        return TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
}
