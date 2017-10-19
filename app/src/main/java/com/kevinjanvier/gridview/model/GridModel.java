package com.kevinjanvier.gridview.model;

/**
 * Created by kevinjanvier on 19/10/2017.
 */

public class GridModel {
    private String name;
    private int photo;

    public GridModel(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
