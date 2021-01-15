package com.angelica.exercise;

public class Main {

    public static void main(String[] args) {
        int boxWidth = 3;
        int boxHeight = 2;
        int boxDepth = 6;

        Box firstBox = new Box(boxWidth, boxHeight, boxDepth);{
            firstBox.boxWidth = boxWidth;
            firstBox.boxHeight =boxHeight;
            firstBox.boxDepth = boxDepth;
            int result = firstBox.calculateBoxVolume();
            System.out.println("The first box´s measure is: " + result);

        Box secondBox = new Box(2,4,6);
            System.out.println("The second box´s measure is: " + secondBox.calculateBoxVolume());


        }
    }

}
