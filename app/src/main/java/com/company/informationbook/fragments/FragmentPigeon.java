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

public class FragmentPigeon extends Fragment {

    public static FragmentPigeon newInstance()
    {
        return new FragmentPigeon();
    }

    private ImageView imageViewPigeon;
    private ProgressBar progressBarPigeon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pigeon,container,false);

        imageViewPigeon = view.findViewById(R.id.imageViewPigeon);
        progressBarPigeon = view.findViewById(R.id.progressBarPigeon);

        Picasso.get().load("https://www.allaboutbirds.org/guide/assets/photo/308074031-480px.jpg").into(imageViewPigeon, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPigeon.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarPigeon.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
