package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {

    private String description;
    private double price;
    private String category;
    private boolean newItem;
    //private Date date;

    public MenuItem(String description, double price, String category, boolean newItem) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.newItem = newItem;
        //this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getNewItem() {
        if (newItem == true) {
            return "New Item!";
        } else {
            return " ";
        }
    }
    public void setNewItem(boolean aNewItem) {
        newItem = aNewItem;
    }

}
