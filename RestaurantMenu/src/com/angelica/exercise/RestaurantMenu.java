package com.angelica.exercise;

import java.util.List;

public class RestaurantMenu {
    private String recipeName;
    private int price;
    private List<String> menuAdditions;

    public RestaurantMenu(String recipeName, int price, List<String> menuAdditions) {
        this.recipeName = recipeName;
        this.price = price;
        this.menuAdditions = menuAdditions;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getMenuAdditions() {
        return menuAdditions;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMenuAdditions(List<String> menuAdditions) {
        this.menuAdditions = menuAdditions;
    }
}
