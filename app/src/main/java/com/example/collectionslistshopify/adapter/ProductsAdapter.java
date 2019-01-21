package com.example.collectionslistshopify.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.collectionslistshopify.R;
import com.example.collectionslistshopify.model.CollectionProducts;

//import com.example.collectionslistshopify.adapter.DataAdapter.DataViewHolder;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    private CollectionProducts productsList;
    private Context context;

    public ProductsAdapter(Context context, CollectionProducts productsList){
        this.context = context;
        this.productsList = productsList;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        public final View mView;

        TextView titleTextView;
        TextView idTextView;

        ProductViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            titleTextView = mView.findViewById(R.id.title);
            idTextView = mView.findViewById(R.id.id);
        }
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.collection_item, parent, false);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.titleTextView.setText(productsList.get(position).getTitle());
        //holder.idTextView.setText(dataList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

}
