package com.angelica.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(17000, 1, "Milk six pack", 12));
        productList.add(new Product(8000, 2, "Chips", 15));
        productList.add(new Product(22000, 3, "Beer six pack", 6));
        productList.add(new Product(19000, 4, "Capuccino", 5));
        productList.add(new Product(14000, 5, "Brownies", 8));

        int menuOption;

        do {
            System.out.println("Menu:");
            System.out.println("  1. Get inventory and selling prices");
            System.out.println("  2. Add new product");
            System.out.println("  0. Exit program");
            System.out.println("Choose one:");
            menuOption = scan.nextInt();

            switch (menuOption) {
                case 1:
                    for (int i = 0; i < productList.size(); i++) {
                        Product currentProduct = productList.get(i);
                        System.out.println("Name: " + currentProduct.getName());
                        System.out.println("ID: " + currentProduct.getProductId());
                        System.out.println("Price: " + currentProduct.getPrice());
                        System.out.println("Quantity: " + currentProduct.getQuantity());
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("Please provide the following info: ");
                    System.out.println("Name:");
                    String name = scan.nextLine();
                    System.out.println("ID:");
                    String ID = scan.nextLine();
                    System.out.println("Price:");
                    String Price = scan.nextLine();
                    System.out.println("Quantity:");
                    String Quantity = scan.nextLine();




                    break;
                case 0:
                default:
                    break;
            }
        } while(menuOption != 0);

    }
}
