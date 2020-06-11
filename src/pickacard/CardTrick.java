package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * @modifier Kushagra Rajdev
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.round(Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)+1]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Enter the Suit: ");
        String suit = input.next();
        System.out.println("Enter the Card: ");
        int card = input.nextInt();
       
        boolean list = false;
        for(int j=0; j<magicHand.length; j++){
            if(card == magicHand[j].getValue() && suit.equalsIgnoreCase(magicHand[j].getSuit()))
            {   System.out.println("Your card is in the list");
                list=true;
            }
        }
        
        if(list==false){
            System.out.println("Card not on the list! You lose!");
        }
        else
            System.out.println("You win!!");
    }

}
