package com.kevinjanvier.gridview.adapter;

/**
 * Created by kevinjanvier on 19/10/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kevinjanvier.gridview.R;
import com.kevinjanvier.gridview.model.GridModel;

import java.util.List;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    private List<GridModel> itemList;
    private Context context;

    public GridAdapter(Context context, List<GridModel> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, null);
        ViewHolder rcv = new ViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.PersonPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView personName;
        private ImageView PersonPhoto;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            personName = (TextView)itemView.findViewById(R.id.country_name);
            PersonPhoto = (ImageView)itemView.findViewById(R.id.country_photo);
        }

        @Override
        public void onClick(View view) {
           //Do Whatever u want
        }
    }
}