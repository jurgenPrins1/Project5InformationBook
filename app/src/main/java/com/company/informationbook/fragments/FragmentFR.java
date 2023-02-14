package com.company.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.company.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFR extends Fragment {

    public static FragmentFR newInstance()
    {
        return new FragmentFR();
    }

    private ImageView imageViewFR;
    private ProgressBar progressBarFR;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fr,container,false);

        imageViewFR = view.findViewById(R.id.imageViewFR);
        progressBarFR = view.findViewById(R.id.progressBarFR);

        Picasso.get().load("https://25174313.fs1.hubspotusercontent-eu1.net/hubfs/25174313/assets_comparehero/contribute-white-flag-campaign-bendera-putih-featured-image.jpg").into(imageViewFR, new Callback() {
            @Override
            public void onSuccess() {
                progressBarFR.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarFR.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
