package com.angelica.exercise;

public class Main {

    public static void main(String[] args) {
        var myValue = 25;
        System.out.println("My value is: " + myValue);

        changeValue(myValue);

    }
    public static void changeValue(int firstArg) {
        System.out.println("first argument: " + firstArg);
        
    }
}
