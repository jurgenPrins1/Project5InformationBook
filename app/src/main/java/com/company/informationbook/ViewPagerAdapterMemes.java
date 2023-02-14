package com.company.informationbook;

import com.company.informationbook.fragments.FragmentMeme;
import com.company.informationbook.fragments.FragmentPigeon;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterMemes extends FragmentStateAdapter {

    public ViewPagerAdapterMemes(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){

            case 0:
                fragment = FragmentMeme.newInstance();
                break;

            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
