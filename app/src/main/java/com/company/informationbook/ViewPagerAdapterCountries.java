package com.company.informationbook;

import com.company.informationbook.fragments.FragmentFR;
import com.company.informationbook.fragments.FragmentIT;
import com.company.informationbook.fragments.FragmentUK;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {

    public ViewPagerAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){

            case 0:
                fragment = FragmentUK.newInstance();
                break;
            case 1:
                fragment = FragmentFR.newInstance();
                break;
            case 2:
                fragment = FragmentIT.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
