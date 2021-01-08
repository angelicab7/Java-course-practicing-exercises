package com.angelica.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<RestaurantMenu> restaurantMenus = new ArrayList<>();
        Restaurant restaurant = new Restaurant("La Gordura", restaurantMenus);

        List<String> menuAdditions = new ArrayList<>();
        menuAdditions.add("Salsa BBQ");
        menuAdditions.add("Queso cheddar");
        restaurantMenus.add(new RestaurantMenu("Deditos de yuca", 10000, menuAdditions));

        menuAdditions = new ArrayList<>();
        menuAdditions.add("Salsa BBQ");
        menuAdditions.add("Papa francesa");
        restaurantMenus.add(new RestaurantMenu("Costillitas BBQ", 40000, menuAdditions));

        menuAdditions = new ArrayList<>();
        menuAdditions.add("Salsa de la casa");
        menuAdditions.add("Papa francesa");
        restaurantMenus.add(new RestaurantMenu("Churrasco", 30000, menuAdditions));

        menuAdditions = new ArrayList<>();
        menuAdditions.add("Salsa de la casa");
        menuAdditions.add("Queso cheddar");
        menuAdditions.add("Salchicha ranchera");
        restaurantMenus.add(new RestaurantMenu("Porcion de papas", 20000, menuAdditions));

        menuAdditions = new ArrayList<>();
        menuAdditions.add("Salsa de la casa");
        menuAdditions.add("Chorizo");
        menuAdditions.add("Ensalada cherry");
        restaurantMenus.add(new RestaurantMenu("Picada 3 carnes", 50000, menuAdditions));

        menuAdditions = new ArrayList<>();
        menuAdditions.add("Ensalada cherry");
        menuAdditions.add("Pico de gallo");
        menuAdditions.add("Agua de panela");
        restaurantMenus.set(2, new RestaurantMenu("Vegan Burger", 23000, menuAdditions));

        System.out.println("Bienvenidos a su restaurante " + restaurant.getName());

        System.out.println("Cantidad de recetas: " + restaurantMenus.size());

        for(int i = 0; i < restaurantMenus.size(); i ++){
          RestaurantMenu currentMenu = restaurantMenus.get(i);
          System.out.println(currentMenu.getRecipeName() + ": $" + currentMenu.getPrice());
        }
    }
}
