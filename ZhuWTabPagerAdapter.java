package com.example.zhuwfirstdemo.zhuw;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ZhuWTabPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> mtitles=new ArrayList<>();

    public ZhuWTabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    public ZhuWTabPagerAdapter(FragmentManager fm, ArrayList<String> titles){
        super(fm);
        this.mtitles=titles;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=new Fragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return mtitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mtitles.get(position);
    }
}
