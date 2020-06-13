package pickacard;

import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        Scanner in = new Scanner(System.in);
        String userSuit; //clubs, diamonds, spades, hearts
        int userCardValue; // 1 to 13
        boolean cardExist = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(c.randomNumber());
            c.setSuit(c.randomSuit());
            magicHand[i] = c;

        }

        System.out.println("Enter suit value: (Spades, Hearts, Clubs, Diamonds)");
        userSuit = in.next();
        System.out.println("choose card value: (1 to 13)");
        userCardValue = in.nextInt();
        for (int sub = 0; sub < magicHand.length; sub++) {
            if (userCardValue == magicHand[sub].getValue()) {
                if (userSuit.equalsIgnoreCase(magicHand[sub].getSuit())) {
                    cardExist = true;
                    break;
                }
            } else {
                cardExist = false;
            }

        }

        if (cardExist == true) {
            System.out.println("Same Card Exist");
        } else {
            System.out.println("Card doesn't exist");
        }

    }

}
