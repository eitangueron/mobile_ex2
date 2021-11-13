package com.example.milab_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton dcBtn;
    private ImageButton marvelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dcBtn = findViewById(R.id.dcBtn);
        marvelBtn = findViewById(R.id.marvelBtn);

        dcBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, dc_heros.class);
            startActivity(intent)
            ;});

        marvelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), marvel_heros.class);
                view.getContext().startActivity(intent);}
        });

    }

}