package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
* @ author Jay Rajeshbhai Patel 
*/

public class CardTrick {

    public static void main(String[] args) {
        
        
        boolean position=true;
        Card[] magicHand = new Card[7];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randNum());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

        
        }
            if ( position == true) 
            {
                System.out.println("::Card is in Array::");
            }
            else
            {
                System.out.println("::Card is not in Array::");
            }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here

    }

    
}
