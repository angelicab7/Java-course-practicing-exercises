package com.angelica.exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber, secondNumber, result;

        int menuOption;

        do {
            System.out.println("Select the operation you wanna do:");
            System.out.println("  1. Add");
            System.out.println("  2. Substract");
            System.out.println("  2. Multiply");
            System.out.println("  2. Divide");
            System.out.println("  0" + ". Exit program");
            menuOption = scan.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Enter your first number: ");
                    firstNumber = scan.nextDouble();
                    System.out.println("Enter your second number: ");
                    secondNumber = scan.nextDouble();
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Enter your first number: ");
                    firstNumber = scan.nextDouble();
                    System.out.println("Enter your second number: ");
                    secondNumber = scan.nextDouble();
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Enter your first number: ");
                    firstNumber = scan.nextDouble();
                    System.out.println("Enter your second number: ");
                    secondNumber = scan.nextDouble();
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Enter your first number: ");
                    firstNumber = scan.nextDouble();
                    System.out.println("Enter your second number: ");
                    secondNumber = scan.nextDouble();
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                    break;
                case 0:
                default:
                    break;
            }
        } while(menuOption != 0);
    }
}
