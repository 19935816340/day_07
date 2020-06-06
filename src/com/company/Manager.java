package com.company;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
        //自动添加默认的super（）
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        //1.看一下群主有多少钱，余额不足时提醒
        int leftmoney = super.getMoney();
        if (leftmoney < totalMoney){
            System.out.println("余额不足");
            return redList;
        }

        //2.扣钱
        super.setMoney(leftmoney-totalMoney);

        //3.将红包分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        //如果除不开，将零头放到最后一个红包里

        //4.将余额一个一个放到集合中

        //放置前count-1个红包
        for (int i = 0; i < count; i++) {
            redList.add(avg);
        }

        //放置第count个
        int last = avg + mod;
        redList.add(last);

        return null;
    }
}
