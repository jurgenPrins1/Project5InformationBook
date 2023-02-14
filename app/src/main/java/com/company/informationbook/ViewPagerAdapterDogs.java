package com.company.informationbook;

import com.company.informationbook.fragments.FragmentHusky;
import com.company.informationbook.fragments.FragmentPigeon;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterDogs extends FragmentStateAdapter {

    public ViewPagerAdapterDogs(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){

            case 0:
                fragment = FragmentHusky.newInstance();
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
