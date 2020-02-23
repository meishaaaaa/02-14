package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;

public class CardMachine {
    private ArrayList<Card> cardSet = null;

    public CardMachine() {
    }

    public void setCardSet() {
        cardSet = new ArrayList<>();
        String[] color = {"黑桃", "红桃", "方块", "梅花" };
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        for (String string : color) {
            for (String numb : num) {
                Card card = new Card(string, numb);
                cardSet.add(card);
            }
        }
        this.cardSet = cardSet;
    }

    public ArrayList<Card> getCardSet() {
        return cardSet;
    }

    public String drawCard(int intNum) {
        CardMachine cardMachine = new CardMachine();
        cardMachine.setCardSet();

        String sum = null;
        if (intNum > 52 | intNum <= 0) {
            sum = "输入值大于牌组总数，请输入小于等于52的正整数";
        } else {
            ArrayList<Card> selectedCard = new ArrayList<>();
            for (int i = 0; i < intNum; i++) {
                Random r = new Random();
                int drawNum = r.nextInt(cardMachine.getCardSet().size());
                selectedCard.add(cardMachine.getCardSet().get(drawNum));
                cardMachine.getCardSet().remove(drawNum);
            }

            sum = selectedCard.toString();
        }
        return sum;
    }
}

