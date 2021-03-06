package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        //从众多的红包中随机选一个，获取随即索引
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除领完的那个红包
        int receiveMoney = list.get(index);
        list.remove(index);
        int delMoney = list.remove(index);
        //查看当前会员有多少钱
        int money = super.getMoney();
        //重新设置一个余额
        super.setMoney(money + delMoney);
    }
}
