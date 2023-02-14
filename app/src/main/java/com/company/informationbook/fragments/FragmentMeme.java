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

public class FragmentMeme extends Fragment {

    public static FragmentMeme newInstance()
    {
        return new FragmentMeme();
    }

    private ImageView imageViewMeme;
    private ProgressBar progressBarMeme;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_meme,container,false);

        imageViewMeme = view.findViewById(R.id.imageViewMeme);
        progressBarMeme = view.findViewById(R.id.progressBarMeme);

        Picasso.get().load("https://www.antagonist.nl/blog/wp-content/uploads/2014/04/meme_bad_luck_brian_repost.jpg").into(imageViewMeme, new Callback() {
            @Override
            public void onSuccess() {
                progressBarMeme.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarMeme.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
