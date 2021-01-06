package com.angelica;

public class Main {
  //Overflow and Underflow
    public static void main(String[] args) {
	 int myValue = 10000;

        byte myMinByteValue = Byte.MIN_VALUE; //8 bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimun Value = " + myMinByteValue);
        System.out.println("Byte maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; //16 bits
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum Value = " + myMinShortValue);
        System.out.println("Short maximum Value = " + myMaxShortValue);

        int myMinIntValue = Integer.MIN_VALUE; //32 bits
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted MAX Value =" + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value ="+(myMinIntValue - 1));


        long myMinLongValue = Long.MIN_VALUE;  //64 bits
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimun value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

         //Casting

        int myTotal = ( myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue= (short) (myMinShortValue / 2);
    }
}

