/*This codebase is inspired by the ideas from
    https://medium.com/@prakash_pun/retrofit-a-simple-android-tutorial-48437e4e5a23?fbclid=IwAR0XtbHExneF6O1Doij-Bd6G9zvTMIy0HFfhlcoKJVd5oD51WIIgmE0R8Rw
*/
package com.example.collectionslistshopify;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.collectionslistshopify.adapter.DataAdapter;
import com.example.collectionslistshopify.adapter.ProductsAdapter;
import com.example.collectionslistshopify.model.CollectionProducts;
import com.example.collectionslistshopify.model.RetroCollection;
import com.example.collectionslistshopify.network.GetDataService;
import com.example.collectionslistshopify.network.RetroCollectionInstance;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private DataAdapter adapter;
    private ProductsAdapter productsAdapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle instanceState) {
        super.onCreate(instanceState);
        setContentView(R.layout.activity_main);

        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("===LOADING===");
        progressDoalog.show();

        //Create handle for the RetroCollectionInstance interface
        GetDataService dataService = RetroCollectionInstance.getRetroCollectionInstance().create(GetDataService.class);
        Call<RetroCollection> call = dataService.getAllCollections("68424466488",1, "c32313df0d0ef512ca64d5b336a0d7c6");
        call.enqueue(new Callback<RetroCollection>() {
            @Override
            public void onResponse(Call<RetroCollection> call, Response<RetroCollection> response) {
                progressDoalog.dismiss();
                generateCollection(response.body());
            }

            @Override
            public void onFailure(Call<RetroCollection> call, Throwable throwable) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Unknown error, please retry!", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void getCollectionDetails(View view){
        GetDataService dataService = RetroCollectionInstance.getRetroCollectionInstance().create(GetDataService.class);
        Call<CollectionProducts> call = dataService.getAllProducts(((TextView)view).getText().toString(),1, "c32313df0d0ef512ca64d5b336a0d7c6");
        call.enqueue(new Callback<CollectionProducts>() {
            @Override
            public void onResponse(Call<CollectionProducts> call, Response<CollectionProducts> response) {
                progressDoalog.dismiss();
                generateProducts(response.body());
            }

            @Override
            public void onFailure(Call<CollectionProducts> call, Throwable throwable) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Unknown error, please retry!", Toast.LENGTH_SHORT).show();
            }

        });

    }

    //generates the list of out collection using RecyclerView with data adapter
    private void generateCollection(RetroCollection dataList) {
        recyclerView = findViewById(R.id.collectionsList);
        adapter = new DataAdapter(this,dataList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void generateProducts(CollectionProducts collectionProducts)
    {
        recyclerView = findViewById(R.id.productsList);
        productsAdapter = new ProductsAdapter(this,collectionProducts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(productsAdapter);
        //recyclerView = findViewById(R.id.)
    }
}
