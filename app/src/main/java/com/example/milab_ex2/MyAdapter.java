package com.example.milab_ex2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHoler> {

    String[] names;
    int[] images;
    Context context;

    public MyAdapter(Context ct, String[] heros, int[] imgs){
        context = ct;
        names = heros;
        images = imgs;
    }

    @NonNull
    @Override
    public MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoler holder, int position) {
        holder.name.setText(names[position]);
        holder.img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class MyViewHoler extends RecyclerView.ViewHolder {

        TextView name;
        ImageView img;

        public MyViewHoler(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.hero_name);
            img = itemView.findViewById(R.id.hero_pic);
        }
    }
}