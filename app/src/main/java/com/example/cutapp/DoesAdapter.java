package com.example.cutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c,ArrayList<MyDoes> p){
        context = c;
        myDoes = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_does,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.titledoes.setText(myDoes.get(position).getTitledoes());
        myViewHolder.descriptiondoes.setText(myDoes.get(position).getDescriptiondoes());
        myViewHolder.datedoes.setText(myDoes.get(position).getDatedoes());
    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titledoes,descriptiondoes,datedoes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = itemView.findViewById(R.id.titledoes);
            descriptiondoes = itemView.findViewById(R.id.descriptiondoes);
            datedoes = itemView.findViewById(R.id.datedoes);
        }
    }
}
