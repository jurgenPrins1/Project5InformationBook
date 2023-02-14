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

public class FragmentUK extends Fragment {

    public static FragmentUK newInstance()
    {
        return new FragmentUK();
    }

    private ImageView imageViewUK;
    private ProgressBar progressBarUK;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_uk,container,false);

        imageViewUK = view.findViewById(R.id.imageViewUK);
        progressBarUK = view.findViewById(R.id.progressBarUK);

        Picasso.get().load("https://cdn.britannica.com/62/4962-004-7D6CF6DB/Flag-Wales.jpg").into(imageViewUK, new Callback() {
            @Override
            public void onSuccess() {
                progressBarUK.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarUK.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
