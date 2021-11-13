package com.example.milab_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class dc_heros extends AppCompatActivity {


    RecyclerView recyclerView;

    String[] heros;
    int[] images =  {R.drawable.superman, R.drawable.batman, R.drawable.wonder_woman,
            R.drawable.the_flash, R.drawable.green_lantern, R.drawable.aquaman};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc_heros);

        heros = getResources().getStringArray(R.array.dc_heros);
        recyclerView = findViewById(R.id.dcRecyclerView);

        MyAdapter myAdapter = new MyAdapter( this, heros, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}