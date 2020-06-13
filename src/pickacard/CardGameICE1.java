/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickacard;

import java.util.Scanner;

/**
 *
 * @author Your wasonan <wasonan.sheridancollege.ca>
 */
public class CardGameICE1 {
    public static void main(String[] args) {
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();//object
            c.setSuits(Card.SUITS[c.randomSuit()]);
            c.setValue(c.randomValue());
            magicHand[i] = c;//saving object in array
            System.out.println(c.getSuits() + " " + c.getValue());
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Suits: ");
        String a = input.nextLine();
        System.out.println("Enter the value of Suits:");
        int n = input.nextInt();

        Card usercard = new Card();

        usercard.setValue(n);
        usercard.setSuits(a);

        int count = 0;

        for (Card magicHand1 : magicHand) {
            if (usercard.getSuits().equalsIgnoreCase(magicHand1.getSuits()) && usercard.getValue() == magicHand1.getValue()) {
                count = 1;
                System.out.println("You card is in MagicHand");
                break;
            } else {
                System.out.println("Losing hand");
                break;
            }
        }
    }
}
