package com.tan_ds.newone.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tan_ds.newone.R;
import com.tan_ds.newone.ViewHolders.HolderForCards;

import java.util.ArrayList;

/**
 * Created by Tan-DS on 6/25/2017.
 */

public class AdapterForCards extends RecyclerView.Adapter<HolderForCards> {

    private ArrayList<String> mDataset;

    public AdapterForCards(ArrayList<String> data){
        this.mDataset = data;
    }

    @Override
    public HolderForCards onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elem_of_recycler, parent, false);
        HolderForCards holder = new HolderForCards(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(HolderForCards holder, int position) {
        holder.onBind(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
