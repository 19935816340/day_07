package com.company;

public class AnimalLiveable1 implements Liveable1 {
    //继承什么都可以不用写，直接调用即可

    @Override
    public void fly(){
        System.out.println("水上漂");
    }
}
