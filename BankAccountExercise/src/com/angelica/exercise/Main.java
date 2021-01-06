package com.angelica.exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your full name in order to create your bank account");
        Scanner scan = new Scanner(System.in);
        String ownerName = scan.nextLine();

        BankAccount bankAccount = new BankAccount(ownerName);

        System.out.println("Account created successfully");

        int menuOption;

        do {
            System.out.println("Menu:");
            System.out.println("  1. Add funds");
            System.out.println("  2. Retrieve funds");
            System.out.println("  0. Exit program");
            System.out.println("Choose one:");
            menuOption = scan.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Please add the amount you want to add");
                    int addingNewFunds = scan.nextInt();
                    bankAccount.addAmount(addingNewFunds);
                    break;
                case 2:
                    System.out.println("Please write the amount to retrieve");
                    int retrievingFunds = scan.nextInt();
                    bankAccount.retrieveAmount(retrievingFunds);
                    break;
                case 0:
                default:
                    break;
            }
            System.out.println("Your balance is: " + bankAccount.getMoneyAmount());
        }
        while(menuOption != 0);
    }
}
