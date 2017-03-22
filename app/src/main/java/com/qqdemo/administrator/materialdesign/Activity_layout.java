package com.qqdemo.administrator.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Activity_layout extends AppCompatActivity {
    @InjectView(R.id.iv_book_image)
    ImageView mIvBookImage;
    @InjectView(R.id.toolbar)
    Toolbar mToolbar;
    @InjectView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    MyAdapter mAdapter;
//    @InjectView(R.id.collapsing_toolbar_layout)
//    CollapsingToolbarLayout mCollapsingToolbarLayout;
//    @InjectView(R.id.tv_title)
//    TextView mTvTitle;
//    @InjectView(R.id.tv_rating)
//    TextView mTvRating;
//    @InjectView(R.id.sliding_tabs)
//    TabLayout mSlidingTabs;
//    @InjectView(R.id.viewpager)
//    ViewPager mViewpager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        ButterKnife.inject(this);

//        mSlidingTabs.addTab(mSlidingTabs.newTab().setText("Tab1"));
//        mSlidingTabs.addTab(mSlidingTabs.newTab().setText("Tab2"));
//        mSlidingTabs.addTab(mSlidingTabs.newTab().setText("Tab3"));
        mToolbar.setTitle("MaterialDesign");

        mAdapter= new MyAdapter();
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerview.setAdapter(mAdapter);
    }

}
