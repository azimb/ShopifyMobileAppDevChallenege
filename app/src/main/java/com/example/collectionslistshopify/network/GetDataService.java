package com.example.collectionslistshopify.network;

import com.example.collectionslistshopify.model.CollectionProducts;
import com.example.collectionslistshopify.model.RetroCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {
    @GET("collects.json")
    Call<RetroCollection> getAllCollections(@Query("collection_id") String collectionId, @Query("page")int page, @Query("access_token")String accessToken);
    Call<CollectionProducts> getAllProducts(@Query("ids") String ids, @Query("page")int page, @Query("access_token") String accessToken);
}
