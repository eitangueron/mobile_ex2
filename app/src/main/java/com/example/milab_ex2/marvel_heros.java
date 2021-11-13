package com.example.milab_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class marvel_heros extends AppCompatActivity {


    RecyclerView recyclerView;

    String[] heros;
    int[] images =  {R.drawable.ironman, R.drawable.captin_america, R.drawable.spiderman, R.drawable.captin_marvel,
            R.drawable.black_panther, R.drawable.deadpool};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel_heros);

        heros = getResources().getStringArray(R.array.marvel_heros);
        recyclerView = findViewById(R.id.marvelRecyclerView);

        MyAdapter myAdapter = new MyAdapter( this, heros, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}