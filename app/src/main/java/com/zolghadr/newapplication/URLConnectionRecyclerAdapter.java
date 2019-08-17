package com.zolghadr.newapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class URLConnectionRecyclerAdapter extends RecyclerView.Adapter<URLConnectionRecyclerAdapter.MovieListRecyclerViewHolder> {


    @NonNull
    @Override
    public URLConnectionRecyclerAdapter.MovieListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull URLConnectionRecyclerAdapter.MovieListRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieListRecyclerViewHolder extends RecyclerView.ViewHolder {
        public MovieListRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}





