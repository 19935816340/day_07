package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRedPacket {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("当前显示群里所有人的余额");
        //一个群主100，3个成员0，0，0
        Manager manager = new Manager("群主", 100);
        Member a = new Member("A", 0);
        Member b = new Member("B", 0);
        Member c = new Member("C", 0);
        manager.show();
        a.show();
        b.show();
        c.show();
        System.out.println("====================");
        System.out.println("请群主输入要发红包的金额");//20
        int money = new Scanner(System.in).nextInt();
        //发红包
        ArrayList<Integer>redList = manager.send(money,3);

        //收红包
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);

        //显示所有人当前的余额
        manager.show();
        a.show();
        b.show();
        c.show();

    }
}
