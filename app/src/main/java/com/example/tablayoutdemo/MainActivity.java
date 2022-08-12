package com.example.tablayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] array = {"CHATS","STATUS","CALLS","PAYMENT","DETAILS","CONTACTS","ADDRESS"};
        ArrayList<String> array = new ArrayList<String>
                (Arrays.asList("CHATS","STATUS","CALLS","PAYMENT","DETAILS","CONTACTS","ADDRESS"));


        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        try {
            for(int i = 0;i<array.size();i++){
                tabLayout.addTab(tabLayout.newTab().setText(array.get(i)));
            }
        }
        catch (Exception e){
            System.out.print(e);
        }


//        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
//        tabLayout.addTab(tabLayout.newTab().setText("STATUS"));
//        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));
//        tabLayout.addTab(tabLayout.newTab().setText("PAYMENT"));
//        tabLayout.addTab(tabLayout.newTab().setText("DETAILS"));
//        tabLayout.addTab(tabLayout.newTab().setText("CONTACTS"));
//        tabLayout.addTab(tabLayout.newTab().setText("ADDRESS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final Myadapter myadapter = new Myadapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(myadapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}