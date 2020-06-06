package com.company;

public class ExtendsDemoTest05 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        // 子类中有show 只会运行重写后的show
        zi.show();
    }
}
