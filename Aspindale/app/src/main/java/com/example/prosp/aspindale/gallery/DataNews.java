package com.example.prosp.aspindale.gallery;

/**
 * Created by prosp on 11/7/2018.
 */


public class DataNews {

    public String uni_image;
    public String uni_name;
    //public String catName;
    //public String sizeName;
    // public String price;


    public DataNews( String fishName,String fishImage) {

        this.uni_name = uni_name;
        //this.catName = catName;
        //this.sizeName = sizeName;
        // this.price = price;
        this.uni_image = uni_image;
    }

    public DataNews() {

    }




    public String getUni_name() {
        return uni_name;
    }

    /*public String getCatName() {
        return catName;
    }

    public String getSizeName() {
        return sizeName;
    }

    public String getPrice() {
        return price;
    }*/

    public  String getUni_image() {
        return uni_image;
    }}
