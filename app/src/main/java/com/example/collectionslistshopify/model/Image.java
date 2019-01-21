package com.example.collectionslistshopify.model;

import com.google.gson.annotations.SerializedName;

public class Image
{
    @SerializedName("created_at")
    private String craeted_at;
    @SerializedName("alt")
    private Integer alt;
    @SerializedName("width")
    private Integer width;
    @SerializedName("height")
    private Integer hieght;
    @SerializedName("src")
    private String src;
}
