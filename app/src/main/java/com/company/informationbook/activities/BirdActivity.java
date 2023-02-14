package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.ViewPagerAdapterBirds;
import com.company.informationbook.ViewPagerAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class BirdActivity extends AppCompatActivity {

    private TabLayout tabLayoutBird;
    private ViewPager2 viewPagerBird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);


         tabLayoutBird = findViewById(R.id.tabLayoutBird);
         viewPagerBird = findViewById(R.id.viewPagerBird);

        ViewPagerAdapterBirds adapter = new ViewPagerAdapterBirds(getSupportFragmentManager(),getLifecycle());

        viewPagerBird.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutBird, viewPagerBird, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position) {
                    case 0:
                        tab.setText("pigeon");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();
    }
}