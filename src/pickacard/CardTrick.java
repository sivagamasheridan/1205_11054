package pickacard;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *Student Number: 991579685
 * @author srinivsi
 * @author Rameen Zahra
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
         Scanner sc = new Scanner(System.in);
        System.out.println("choose card value");
        int value = sc.nextInt();
        System.out.println("choose suit value");
        String suit = sc.next();
        for(int i = 0;i<magicHand.length;i++)
        {
            if(value == magicHand[i].getValue())
            {
           if(suit.equalsIgnoreCase(magicHand[i].getSuit()))
           {
                 System.out.println("card found");
           }}
               else
               System.out.println("card not found");  
               
            
        
        }
            
    }

}
