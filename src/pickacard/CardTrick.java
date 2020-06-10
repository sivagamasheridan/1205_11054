package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * @modifier Alqassam Firwana
 * @ID 991606962
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;//saving object in array
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please Enter A Suit: ");
        String userSuit = input.nextLine();
        System.out.println("Please Enter A value");
        int userValue = input.nextInt();
        // and search magicHand here
        boolean match = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (userValue == magicHand[i].getValue() && userSuit.equalsIgnoreCase(magicHand[i].getSuit())) {
                System.out.println("Your Card is on the list");
                match = true;
            }
        }

        if (match == true) {
            System.out.println("Your Card is not on the list");
        }
        //Then report the result here
        if (match) {
            System.out.println("We Got A Winner");
        } else {
            System.out.println("You Loose");
        }

    }

}
