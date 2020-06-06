package com.company;

public interface A {


    /**
     * 接口格式
     * public interface 接口名{
     * 抽象方法
     * 默认方法
     * 静态方法
     * 私有方法
     * }
     */
    //默认方法 使用default 修饰，不可以省略
    //功能是供子类调用或者子类重写
    public default void method(){
        //执行语句
    }
    //静态方法，使用static修饰，供接口调用
    public static void method2(){
        //执行语句
    }
    //私有方法
}
