package com.thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] color = {"黑桃", "红桃", "方块", "梅花"};
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<Card> list1 = new ArrayList<>();
        list1 = createCard(color, num);

        String[] fullCard = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            fullCard[i] = list1.get(i).toString();
        }
        CardMachine one = new CardMachine();
        one.setName("抽牌机");

        Scanner sc = new Scanner(System.in);
        System.out.println("请在此输入要抽的牌熟：");
        int intNum = sc.nextInt();

        one.drawCard(fullCard, intNum);
    }
    public static ArrayList<Card> createCard(String[] color, String[] num) {
        ArrayList<Card> list = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                list.add(new Card(color[i], num[j]));
            }
        }
        return list;
    }
}




