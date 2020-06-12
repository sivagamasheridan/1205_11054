package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 *playing a card game
 * @author Gursimrat kaur
 * @version 1.0
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random r= new Random();
        Scanner s = new Scanner(System.in);
        String cardSuit,userCard;
        int cardValue;
        boolean match= false;

        for (int i = 0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomNumberGenerator());
            c.setSuit(c.randomSuitGenerator());
            System.out.println(c.getSuit()+" "+c.getValue());
            magicHand[i]=c;
         }

        System.out.println("Please enter your card suit: Clubs, Spades,Diamonds, Hearts");
        cardSuit=s.nextLine();
        System.out.println("Please enter your card value:1-13");
        cardValue=s.nextInt();
        for(int i=0; i<magicHand.length;i++)
        {
           if(cardSuit.equals(magicHand[i].getSuit()) && cardValue==magicHand[i].getValue())
           {
               match=true;
               break;
           }
        }
           if(match)
           {
               System.out.println("Congratulations Your Card is in Magic Hand");
           }
           else
           {
               System.out.println("Sorry your card is not present in magic Hand");
           }
    }
}
  
