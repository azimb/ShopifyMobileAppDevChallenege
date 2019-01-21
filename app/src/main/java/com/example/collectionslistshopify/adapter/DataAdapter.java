package com.example.collectionslistshopify.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.collectionslistshopify.R;
import com.example.collectionslistshopify.model.RetroCollection;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    private RetroCollection dataList;
    private Context context;

    public DataAdapter(Context context, RetroCollection dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class DataViewHolder extends RecyclerView.ViewHolder{
        public final View mView;

        TextView titleTextView;
        TextView idTextView;

        DataViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            titleTextView = mView.findViewById(R.id.title);
            idTextView = mView.findViewById(R.id.id);
        }
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.collection_item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.idTextView.setText(dataList.get(position).getId());
        //holder.idTextView.setText(dataList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
