package com.zolghadr.newapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ListRecyclerViewHolder> {

    List<String> menu;
    Recycler recycler;

    public RecyclerAdapter(List<String> list, Recycler recycler) {

        this.menu = list;
        this.recycler = recycler;

    }


    @NonNull
    @Override
    public ListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        ListRecyclerViewHolder holder = new ListRecyclerViewHolder(v,recycler);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ListRecyclerViewHolder holder, int position) {

        String name = menu.get(position);
        holder.txtList.setText(name);


    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    class ListRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txtList;
        List<String> myList = new ArrayList<>();
        Recycler recycler;

        public ListRecyclerViewHolder(@NonNull View itemView, Recycler recycler) {
            super(itemView);
            this.myList = menu;
            this.recycler = recycler;
            itemView.setOnClickListener((View.OnClickListener) this);
            txtList = itemView.findViewById(R.id.txtList);

        }

        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    Intent intent0 = new Intent(this.recycler, Dial.class);
                    this.recycler.startActivity(intent0);
                    break;
                case 1:
                    Intent intent1 = new Intent(this.recycler, Profile.class);
                    this.recycler.startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(this.recycler, Months.class);
                    this.recycler.startActivity(intent2);
                    break;

            }
        }


    }
}