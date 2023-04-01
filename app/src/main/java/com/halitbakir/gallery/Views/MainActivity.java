package com.halitbakir.gallery.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;

import com.halitbakir.gallery.Adapters.ImgPagerAdapter;
import com.halitbakir.gallery.R;

public class MainActivity extends AppCompatActivity {
    private Integer[] imgList = {
            R.drawable.picture1,
            R.drawable.picture2,
            R.drawable.picture3,
            R.drawable.picture4,
            R.drawable.picture5,
            R.drawable.picture6,
    };

    private ViewPager mViewPager;

    private ImgPagerAdapter mAdapter;

    private void init() {
        mViewPager = findViewById(R.id.main_activity_viewPager);

        mAdapter = new ImgPagerAdapter(imgList, this);
        mViewPager.setAdapter(mAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}