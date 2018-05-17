package com.example.nguyenson.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroAdapterView extends RecyclerView.Adapter<HeroAdapterView.ViewHolder> {
    private ArrayList<Hero> mList;
    public HeroAdapterView(ArrayList<Hero> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hero,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mNameHero.setText(mList.get(position).toString());
        holder.mImageHero.setImageResource(Integer.parseInt(mList.get(position).toString()));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mNameHero;
    private ImageView mImageHero;

        public ViewHolder(View itemView) {
            super(itemView);
            mNameHero = itemView.findViewById(R.id.text_name_hero);
            mImageHero = itemView.findViewById(R.id.image_hero);
        }
    }
}
