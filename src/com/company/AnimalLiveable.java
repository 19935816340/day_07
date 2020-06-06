package com.company;

//public abstract class AnimalLiveable implements Liveable{
public class AnimalLiveable implements Liveable{

    @Override
    public void eat() {
        System.out.println("卡卡造");

    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");

    }
}
//不加abstract的话，会产生错误，也可以实现所有的成员方法