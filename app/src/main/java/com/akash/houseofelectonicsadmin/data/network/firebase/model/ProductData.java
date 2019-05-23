package com.akash.houseofelectonicsadmin.data.network.firebase.model;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

    public String name;
    public String description;
    public String price;
    public String typeName;
    public String typeValue;
    public List<String> imagePath = new ArrayList<>();

    public ProductData() {

    }

    public ProductData(String name, String description, String price, String typeValue, String typeName,
                       List<String> imagePath) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.typeValue = typeValue;
        this.typeName = typeName;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<String> getImagePath() {
        return imagePath;
    }
}
