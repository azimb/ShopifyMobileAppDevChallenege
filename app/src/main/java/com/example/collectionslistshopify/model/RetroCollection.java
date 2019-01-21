package com.example.collectionslistshopify.model;

public class RetroCollection {

    /*
    @SerializedName("id")
    private Integer id;
    @SerializedName("handle")
    private String handle;

    @SerializedName("title")
    private String title;

    @SerializedName("updated_at")
    private String updated_at;
    @SerializedName("body_html")
    private String body_html;
    @SerializedName("published_at")
    private String published_at;
    @SerializedName("sort_order")
    private String sort_order;
    @SerializedName("template_suffix")
    private String template_suffix;
    @SerializedName("published_scope")
    private String published_scope;
    @SerializedName("admin_graphql_api_id")
    private String admin_graphql_api_id;
    @SerializedName("image")
    private Image image;



    public RetroCollection(Integer id, String handle, String title, String updated_at, String body_html, String published_at, String sort_order, String template_suffix, String published_scope, String admin_graphql_api_id, Image image){
        //this.id = id;
        //this.handle = handle;
        this.title = title;

        this.updated_at = updated_at;
        this.body_html = body_html;
        this.published_at = published_at;
        this.sort_order = sort_order;
        this.template_suffix = template_suffix;
        this.published_scope = published_scope;
        this.admin_graphql_api_id = admin_graphql_api_id;
        this.image = image;

    }

    //public Integer getId() { return  this.id; }
    //public String getHandle() { return this.handle; }
    public String getTitle() { return this.title; }


    public String getUpdated_at() { return this.updated_at; }
    public String getBody_html() { return this.body_html; }
    public String getPublished_at() { return this.published_at; }
    public String getSort_order() { return this.sort_order; }
    public String getTemplate_suffix() { return this.template_suffix; }
    public String getPublished_scope() { return this.published_scope; }
    public String getAdmin_graphql_api_id() { return  this.admin_graphql_api_id; }
    public Image getImage(){ return this.image; }


    //public void setId(Integer id){ this.id = id; }
    //public void setHandle(String handle){ this.handle = handle; }

    public void setTitle(String title) { this.title = title; }


    public void setUpdated_at(String updated_at){this.updated_at = updated_at;}
    public void setBody_html(String body_html){this.body_html = body_html;}
    public void setPublished_at(String published_at){this.published_at = published_at;}
    public void setSort_order(String sort_order){this.sort_order = sort_order;}
    public void setTemplate_suffix(String template_suffix){this.template_suffix = template_suffix;}
    public void setPublished_scope(String published_scope){ this.published_scope = published_scope;}
    public void setAdmin_graphql_api_id(String admin_graphql_api_id){this.admin_graphql_api_id = admin_graphql_api_id;}
    public void setImage(Image image){this.image = image;}

    */

    private Collects[] collects;

    public Collects[] getCollects ()
    {
        return collects;
    }

    public void setCollects (Collects[] collects)
    {
        this.collects = collects;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [collects = "+collects+"]";
    }

    public int size()
    {
        return this.collects.length;
    }

    public Collects get(int position){
        return this.collects[position];
    }

    public static class Collects
    {
        private String position;

        private String id;

        private String updated_at;

        private String collection_id;

        private String product_id;

        private String sort_value;

        private String created_at;

        private String featured;

        public String getPosition ()
        {
            return position;
        }

        public void setPosition (String position)
        {
            this.position = position;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String getCollection_id ()
        {
            return collection_id;
        }

        public void setCollection_id (String collection_id)
        {
            this.collection_id = collection_id;
        }

        public String getProduct_id ()
        {
            return product_id;
        }

        public void setProduct_id (String product_id)
        {
            this.product_id = product_id;
        }

        public String getSort_value ()
        {
            return sort_value;
        }

        public void setSort_value (String sort_value)
        {
            this.sort_value = sort_value;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String getFeatured ()
        {
            return featured;
        }

        public void setFeatured (String featured)
        {
            this.featured = featured;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [position = "+position+", id = "+id+", updated_at = "+updated_at+", collection_id = "+collection_id+", product_id = "+product_id+", sort_value = "+sort_value+", created_at = "+created_at+", featured = "+featured+"]";
        }
    }
}