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

public class FragmentIT extends Fragment {

    public static FragmentIT newInstance()
    {
        return new FragmentIT();
    }

    private ImageView imageViewIT;
    private ProgressBar progressBarIT;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_it,container,false);

        imageViewIT = view.findViewById(R.id.imageViewIT);
        progressBarIT = view.findViewById(R.id.progressBarIT);

        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTR0SgA8U5dlQ_GgUSb26iSqeX0RtlsT3bzGRjG5bW9&s").into(imageViewIT, new Callback() {
            @Override
            public void onSuccess() {
                progressBarIT.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarIT.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
