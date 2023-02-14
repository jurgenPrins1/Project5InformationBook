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

public class FragmentHusky extends Fragment {

    public static FragmentHusky newInstance()
    {
        return new FragmentHusky();
    }

    private ImageView imageViewHusky;
    private ProgressBar progressBarHusky;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_husky,container,false);

        imageViewHusky = view.findViewById(R.id.imageViewHusky);
        progressBarHusky = view.findViewById(R.id.progressBarHusky);

        Picasso.get().load("https://cdn.britannica.com/84/232784-050-1769B477/Siberian-Husky-dog.jpg").into(imageViewHusky, new Callback() {
            @Override
            public void onSuccess() {
                progressBarHusky.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarHusky.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
