package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
      
        
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your card suite");
        String a=input.nextLine();
        System.out.println("Enter your card value");
        int b =input.nextInt();
        
        Card[] magicHand = new Card[7];{
        boolean list =false;
    
         for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(c.randomvalue());
           
            c.setSuit(Card.SUITS[c.randomsuit()]);
            magicHand[i]=c;
            
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        for(int i=0;i<magicHand.length;i++)
        {
            if(b==magicHand[i].getValue() && a.equalsIgnoreCase(magicHand[i].getSuit()))
            {
             list=true;
            }
            
          }
        if(list==false)
            {
                System.out.println("your card is not there");
                System.out.println("you lose");
            }
            
            else
            {
                System.out.println("you win");
            }
    }

    }
}
