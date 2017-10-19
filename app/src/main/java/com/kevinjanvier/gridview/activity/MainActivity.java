package com.kevinjanvier.gridview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kevinjanvier.gridview.R;
import com.kevinjanvier.gridview.adapter.GridAdapter;
import com.kevinjanvier.gridview.model.GridModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<GridModel> rowListItem = getitems();
        GridLayoutManager lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        GridAdapter rcAdapter = new GridAdapter(this, rowListItem);
        rView.setAdapter(rcAdapter);
    }


    private List<GridModel> getitems(){

        List<GridModel> allItems = new ArrayList<>();
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Keneth Al", R.drawable.user));
        allItems.add(new GridModel("Ivan  Mworozi", R.drawable.user));
        allItems.add(new GridModel("Isabella Ashaba", R.drawable.user));
        allItems.add(new GridModel("Mukamale Dronam", R.drawable.user));
        allItems.add(new GridModel("Kriba", R.drawable.user));
        allItems.add(new GridModel("Chinabal", R.drawable.user));
        allItems.add(new GridModel("Keneth", R.drawable.user));
        allItems.add(new GridModel("Keneths", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));
        allItems.add(new GridModel("Kevin Janvier", R.drawable.user));

        return allItems;
    }
}
