package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.ViewPagerAdapterDogs;
import com.company.informationbook.ViewPagerAdapterMemes;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DiscordActivity extends AppCompatActivity {

    private TabLayout tabLayoutDisc;
    private ViewPager2 viewPagerDisc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discord);

        tabLayoutDisc = findViewById(R.id.tabLayoutMeme);
        viewPagerDisc = findViewById(R.id.viewPagerMeme);

        ViewPagerAdapterMemes adapter = new ViewPagerAdapterMemes(getSupportFragmentManager(),getLifecycle());

        viewPagerDisc.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutDisc, viewPagerDisc, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position) {
                    case 0:
                        tab.setText("Meme");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();

    }
}