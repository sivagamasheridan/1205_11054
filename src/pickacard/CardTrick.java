package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
* @ author Jay Rajeshbhai Patel 
*/

public class CardTrick {

         public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        //card object created
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            System.out.println(c.getValue()+" "+c.getSuit());
//printing statement
        }
        System.out.println("Enter Suit");
        String s = input.next();
        System.out.println("Enter value");
        int value = input.nextInt();
        boolean is = true;
//for statement
        for (Card magicHand1 : magicHand)
        {
//if else statement
            if (value == magicHand1.getValue() && s.equalsIgnoreCase(magicHand1.getSuit()))
            {
                System.out.println("Your Card is in the list");
                is = false;
            }
        }
        if (is == true)
        {
            System.out.println("Your Card is not in the list");
        }
}

            }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here

    }

    
}
