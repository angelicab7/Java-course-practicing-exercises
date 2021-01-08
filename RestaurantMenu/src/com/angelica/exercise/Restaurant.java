package com.angelica.exercise;

import java.util.List;

public class Restaurant {
    private List<RestaurantMenu> menu;
    private String name;

    Restaurant(String name, List<RestaurantMenu> menu) {
        this.menu = menu;
        this.name = name;
    }

    public List<RestaurantMenu> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public void setMenu(List<RestaurantMenu> menu) {
        this.menu = menu;
    }

    public void setName(String name) {
        this.name = name;
    }
}
