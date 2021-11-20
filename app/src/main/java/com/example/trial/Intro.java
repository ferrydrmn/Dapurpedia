package com.example.trial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Intro extends AppCompatActivity {

    ImageView logointro,greeting,splashImg;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_PAGES =3;
    private ViewPager2 viewPager2;
    private ScreenSlidePagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        logointro = findViewById(R.id.logo_intro);
        greeting = findViewById(R.id.greeting);
        splashImg = findViewById(R.id.image_intro);
        lottieAnimationView = findViewById(R.id.lottie);

        viewPager2 =findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager2.setAdapter(pagerAdapter);

        //splashimg atau background slide upward. sisanya slide downward
        splashImg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logointro.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        greeting.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

    }
    private class ScreenSlidePagerAdapter extends FragmentStateAdapter{

        public ScreenSlidePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    OnBoarding1 tab1 = new OnBoarding1();
                    return tab1;
                case 1:
                    OnBoarding2 tab2 = new OnBoarding2();
                    return tab2;
                case 2:
                    OnBoarding3 tab3 = new OnBoarding3();
                    return tab3;
            }return null;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}