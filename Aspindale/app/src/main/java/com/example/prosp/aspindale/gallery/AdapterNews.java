package com.example.prosp.aspindale.gallery;

/**
 * Created by prosp on 11/7/2018.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prosp.aspindale.R;

import java.util.Collections;
import java.util.List;

//import com.example.prosp.offcampuslife.property.DataPro;

public class AdapterNews extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataNews> data = Collections.emptyList();
    DataNews current;
    int currentPos = 0;

    // create constructor to innitilize context and data sent from MainActivity
    public AdapterNews(Context context, List<DataNews> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.gallery, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        // Get current position of item in recyclerview to bind data and assign values from list
        final MyHolder myHolder = (MyHolder) holder;
        final DataNews current = data.get(position);
        myHolder.textFishName.setText(current.uni_name);
        // myHolder.textFishName.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));
        // myHolder.textSize.setText(current.sizeName);
        // myHolder.textType.setText(current.catName);
        //myHolder.textPrice.setText(current.price + "p");
        // myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

        // load image into imageview using glide
        Glide.with(context).load("http://10.0.2.2/offcampuslife/images/" + current.uni_image)
                .placeholder(R.drawable.ic_menu_camera)
                .error(R.drawable.ic_menu_camera)
                .into(myHolder.ivFish);


        myHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }





        });


    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{

        TextView textFishName;
        ImageView ivFish;
        TextView textSize;
        TextView textType;
        TextView textPrice;
        RelativeLayout relative;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textFishName= (TextView) itemView.findViewById(R.id.textFishName);
            ivFish= (ImageView) itemView.findViewById(R.id.ivFish);
            //textSize = (TextView) itemView.findViewById(R.id.textSize);
            //textType = (TextView) itemView.findViewById(R.id.textType);
            //textPrice = (TextView) itemView.findViewById(R.id.textPrice);
            relative=(RelativeLayout)itemView.findViewById(R.id.relative);
        }

    }

}