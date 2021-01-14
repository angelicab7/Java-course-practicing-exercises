package com.angelica.exercise;

public class Box {
    public int boxWidth;
    public int boxHeight;
    public int boxDepth;

    public Box(int boxWidth, int boxHeight, int boxDepth) {
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        this.boxDepth = boxDepth;
    }

    public int calculateBoxVolume() {
        return (boxWidth * boxHeight * boxDepth);
    }
}