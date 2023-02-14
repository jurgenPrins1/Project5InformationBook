package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.ViewPagerAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DuckActivity extends AppCompatActivity {

    private TabLayout tabLayoutCountry;
    private ViewPager2 viewPagerCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duck);

        tabLayoutCountry = findViewById(R.id.tabLayoutUK);
        viewPagerCountry = findViewById(R.id.viewPagerUK);

        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(),getLifecycle());

        viewPagerCountry.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountry, viewPagerCountry, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position) {
                    case 0:
                        tab.setText("UK");
                        break;
                    case 1:
                        tab.setText("FR");
                        break;
                    case 2:
                        tab.setText("IT");
                }
            }
        });

        tabLayoutMediator.attach();
    }
}