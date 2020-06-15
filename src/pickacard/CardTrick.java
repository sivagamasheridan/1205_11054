package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
* @ author Jay Rajeshbhai Patel
* @modifier Jasmine Kaur
* Student ID
*/

public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            System.out.println(c.getValue() + " " + c.getSuit());
        }
        System.out.println("Enter Suit");
        String s = input.next();
        System.out.println("Enter Value");
        int value = input.nextInt();
        
        boolean is = true;
        for (Card magicHand1 : magicHand) {
            if(value == magicHand1.getValue() && s.equalsIgnoreCase(magicHand1.getSuit())){
                System.out.println("Your card is in the list");
                is = false;
            } else {
            }
        }
        if (is == true)
            System.out.println("Your card is not in the list");
    }

    
}
