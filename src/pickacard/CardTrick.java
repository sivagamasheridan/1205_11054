package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * Arshdeep Singh | 991595511 | Modification #Github !
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setValue(((int)Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            magicHand[i] = c;
        
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    Scanner k = new Scanner(System.in);
        System.out.println("enter any 652 card value");
        int value = k.nextInt();
        System.out.println("choose suit value");
        String suit = k.next();
        for(int sub = 0;sub<magicHand.length;sub++)
        {
            if(value == magicHand[sub].getValue())
            {
           if(suit.equalsIgnoreCase(magicHand[sub].getSuit()))
           {
                 System.out.println("card found");
           }}
               else
               System.out.println("card not found");  
               
            
        
        }
            
        
        
    }

}
