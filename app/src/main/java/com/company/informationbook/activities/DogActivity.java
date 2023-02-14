package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.ViewPagerAdapterCountries;
import com.company.informationbook.ViewPagerAdapterDogs;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DogActivity extends AppCompatActivity {

    private TabLayout tabLayoutDog;
    private ViewPager2 viewPagerDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        tabLayoutDog = findViewById(R.id.tabLayoutDog);
        viewPagerDog = findViewById(R.id.viewPagerDog);

        ViewPagerAdapterDogs adapter = new ViewPagerAdapterDogs(getSupportFragmentManager(),getLifecycle());

        viewPagerDog.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutDog, viewPagerDog, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position) {
                    case 0:
                        tab.setText("Husky");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();

    }
}