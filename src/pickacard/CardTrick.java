package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 *@author Gurveer Singh
 *991588362
 */
public class CardTrick {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your card suit: ");
        String userSuit = input.nextLine();
        System.out.println("please enter your card value: ");
        int uservalue = input.nextInt();
        
          Card[] magic = new Card[7];
        boolean compare =false;
        int i;
        for ( i=0; i<magic.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.Suit[c.randomSuit()]);
            magic[i]=c;
           if(uservalue==magic[i].getValue())
           {
               System.out.println("Card found");
               compare=true;
           }
            
        }  

           if(compare==false)
            {
                System.out.println("no card found");
                System.out.println("Defeated!");
            }
            else
            {
                System.out.println("You win!");//win
            }

        
        
    }
    

}
