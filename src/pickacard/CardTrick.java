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
        
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //set a random value to card object
            c.setValue((int)Math.ceil(Math.random() * 13));
            //set suit to card object
            c.setSuit(Card.SUITS[((int)Math.ceil(Math.random() * 3))]);
            //insert the card object to array
            magicHand[i] = c;
            
        }
         //create user card object
         Card userCard = new Card();
        //read value and suit from user for user card
        System.out.println("Please enter the value of your card");
        userCard.setValue(input.nextInt());
        System.out.println("Please enter the the suit of your card");       
        userCard.setSuit( input.next());
       
        
        
        // and search magicHand 
        for (int i = 0; i < magicHand.length; i++) {
            
            if((magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))&&(magicHand[i].getValue() == userCard.getValue())){
                //set true to the flag variable
                flag = true;
            }
           
        }
        //display the result based on the flag value
        if(flag){
             System.out.println("Hurray!!!your card matches, Congratulations");
        }else{
            System.out.println("Sorry!, Better luck next time");
        }
        
    }

}
