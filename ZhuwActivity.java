package com.example.zhuwfirstdemo.zhuw;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.zhuwfirstdemo.R;
import com.example.zhuwfirstdemo.demo.TabFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ZhuwActivity extends AppCompatActivity{
     private TabLayout mTabLayout;
     private ViewPager mViewPager;
     ArrayList<String> mTitles=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_layout);
        initView();
        mTitles.add("aaa");
        mTitles.add("bbb");
        mTitles.add("ccc");
        ZhuWTabPagerAdapter zhuWTabPagerAdapter=new ZhuWTabPagerAdapter(getSupportFragmentManager(),mTitles);
        mViewPager.setAdapter(zhuWTabPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
    public void initView(){
        mViewPager=findViewById(R.id.viewpager);
        mTabLayout=findViewById(R.id.tablayout);
    }
}