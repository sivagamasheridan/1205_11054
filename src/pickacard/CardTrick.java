package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 * @author Megha Bhagat
 * 991594562
 * arya
 */
public class CardTrick {

    public static void main(String[] args) {
        
        //initializing
       boolean search = false;
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            System.out.println(c.getValue() + " " + c.getSuit());

        }

        //insert code to ask the user for Card value and suit, create their card
        
         System.out.println("Enter The Card option here: ");
        int cardOption = input.nextInt();
        
        System.out.println("Enter the suit card here:");
        String suit= input.next(); 
   
    
       //  The search of the magicHand here
         
        for (int i = 0; i < magicHand.length; i++) {
            if (cardOption == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit())) {
                System.out.println("Wow congratulations! the card is in the list ");
                search = true;
            }
        }

        if (search == false) {
            System.out.println(" Sorry! please try again the card is not in the list");
        }
     
        
           
       //Then report the result here
       if (search)
       {
       System.out.println("the winner is");}
       else
       {
           System.out.println("the card is not present");
           System.out.println("defeated");
       }
    }
}
