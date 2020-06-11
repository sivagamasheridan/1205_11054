package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            System.out.println(c.getValue() + " " + c.getSuit());
        }

        System.out.println("Please Enter Suit : ");
        String suit = sc.next();
        System.out.println("Please Enter Value : ");
        int value = sc.nextInt();

        boolean isPresent = true;
        for (Card magicHand1 : magicHand) {
            if (value == magicHand1.getValue() && suit.equalsIgnoreCase(magicHand1.getSuit())) {
                System.out.println("Yes... Your card is in the list.");
                isPresent = false;
            }
        }
        if (isPresent) {
            System.out.println("Sorry, Your card is not in the list.");
        }
    }

}
