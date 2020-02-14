package com.thoughtworks;

import java.util.Arrays;

public class CardMachine {
    private String name;

    public CardMachine() {
    }

    public CardMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drawCard(String[] name, int intNum) {
        intNum -= 1;
        if (intNum > 52 | intNum <= 0) {
            System.out.println("输入值大于牌组总数，请输入小于等于52的正整数");
        } else {
            int[] drawNum = randomArray(intNum, 52);
            System.out.println(Arrays.toString(draw(name, drawNum)));

        }
    }

    public String[] draw(String[] name, int[] num) {
        String[] draw = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            draw[i] = name[num[i]];
        }
        return draw;
    }

    public static int[] randomArray(int len, int max) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        return arr;
    }
}

