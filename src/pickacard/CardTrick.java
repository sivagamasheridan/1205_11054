package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * @modifier Jay Patel
 * Student Id: 991592044
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)((Math.random()*3)+1)]);
            magicHand[i]=c;
            System.out.println(c.getValue()+" "+c.getSuit());
        }

        System.out.println("Enter a Card Value Between 1 and 13.");
        int val = input.nextInt();
        System.out.println("Enter a Card Suit You Want.");
        String suit = input.next();
        
        boolean compare = false;
        for(int k=0; k<magicHand.length; k++){
            if(val == magicHand[k].getValue() && suit.equalsIgnoreCase(magicHand[k].getSuit()))
            {   System.out.println("Your Card Is In The List.");
                compare=true;
            }
        }
        
        if(compare==false){
            System.out.println("Sorry!Your Card Is Not On The List.");
        }
    }

}
