package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * @modifier Onisha Edwards 991422700
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Card[] magicHand = new Card[7];
       

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS [c.cardSuit()]);
            c.setValue(c.cardValue());
            
            
            magicHand[i]=c;
           
           System.out.println(c.getSuit() + "\t" + c.getValue());          
        }
        
      System.out.println("Enter one of the four suits");
       String deck=input.next();
       
       System.out.println("Enter a card number");
       int number=input.nextInt();
      
       for (int i = 0; i < magicHand.length; i++) {
           
           if(deck.equals(magicHand[i].getSuit()) && number==magicHand[i].getValue()){
             System.out.println("Your card is a match");
              break;
           }else{
               System.out.println("Your card is not a match");
             
           }
       }
       
       
       
    }
    
       
    }


