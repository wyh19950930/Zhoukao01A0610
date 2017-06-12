package com.bwei.haozi.zhoukao01a0610;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends FragmentActivity {

    private ViewPager vp;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);

        MainAdapter adapter = new MainAdapter(getSupportFragmentManager());

        vp.setAdapter(adapter);

//关联
        tab.setupWithViewPager(vp);

//设置选择和选中字体的颜色
        tab.setTabTextColors(getResources().getColor(R.color.cgray),getResources().getColor(R.color.coffer));

//设置显示器颜色
        tab.setSelectedTabIndicatorColor(getResources().getColor(R.color.coffer));

//设置模式有常规和滚动
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);



}
}
