package com.example.collectionslistshopify.model;

public class CollectionProducts {
    private Products[] products;

    public Products[] getProducts ()
    {
        return products;
    }

    public void setProducts (Products[] products)
    {
        this.products = products;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [products = "+products+"]";
    }

    public Products get(int position)
    {
        return  this.products[position];
    }

    public int size()
    {
        return  this.products.length;
    }
}
