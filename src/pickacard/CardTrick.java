package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
* @moddifier :jaskaran singh punn
* student id :991608479
*/

public class CardTrick {

    
      public static void main(String[] args)

    {

        Scanner input=new Scanner(System.in); // input scanner

       

        Card[] magicHand = new Card[7];

        //array list

        for (int i=0; i<magicHand.length; i++)

        {

            Card c = new Card();

            //c.setValue(insert call to random number generator here)

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

            c.setValue((int)(Math.random()*13+1));

            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);

            magicHand[i]=c;

            System.out.println(c.getValue()+" "+c.getSuit());

        }

        System.out.println("Enter Suit");   //it display enter Suit

        String s = input.next();

        //user input suit

        System.out.println("Enter value");   // it display enter Enter value

        int value = input.nextInt();

        //user input value

        boolean is = true;

        //return value

        for (Card magicHand1 : magicHand)

        {

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
