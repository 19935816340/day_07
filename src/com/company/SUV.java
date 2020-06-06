package com.company;

public class SUV extends Auto {
    private int miniLength = 4295;
    private int midLength = 5070;

    public SUV(double length, double price) {
        super("SUV", length, price);
    }

    // 判断 小型车
    public boolean miniSUV() {
        return getLength() <= miniLength;
    }

    // 判断 大型车
    public boolean largeSUV() {
        return getLength() > midLength;
    }

    // 判断 中型车
    public boolean midSUV() {
        return getLength() > miniLength && getLength() <= midLength;
    }
}

