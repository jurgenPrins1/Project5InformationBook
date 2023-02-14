package com.company.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.ColorSpace;
import android.os.Bundle;

import com.company.informationbook.AdapterClass;
import com.company.informationbook.ModelClass;
import com.company.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        arrayList = new ArrayList<>();

        ModelClass modelClass1 = new ModelClass("download","Dog");
        ModelClass modelClass2 = new ModelClass("duck_pic","Duck");
        ModelClass modelClass3 = new ModelClass("emma","Bird");
        ModelClass modelClass4 = new ModelClass("discord_tie","Discord");
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);

    }
}