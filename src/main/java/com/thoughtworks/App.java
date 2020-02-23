package com.thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CardMachine cardMachine = new CardMachine();
        cardMachine.setCardSet();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(cardMachine.drawCard(num));

    }
}




