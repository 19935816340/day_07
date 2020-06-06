package com.company;

public class ExtendsDemoTest03 {
    public static void main(String[] args) {
        /**
         * 子类父类的成员变量重名
         * 有影响 new子类时调用的是子类的成员变量
         * 想要调用父类的要用super关键字 就像本类使用this一样
         */
        Zi zi = new Zi();
        zi.show();
    }
}
