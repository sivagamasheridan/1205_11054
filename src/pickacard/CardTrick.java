/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickacard;
import java.util.Scanner;
/**
 *
 * @author srinivsi
 
 */
public class CardTrick
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
   // code to generate 7 random cards and store in array
        
       Card[] magicHand = new Card[7];//array of objects to store individual card
        
        
        for (int m=0;m<magicHand.length;m++)
        {
             Card c = new Card();//object refering to individual card
           c.setValue(c.randomValue());
           c.setSuit(c.randomSuit());
           magicHand[m]=c;//saving object in array
            System.out.println(c.getValue() + " of " + c.getSuit());
          
        }
        
    //take input from user and compare with array 
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Suit");
   String userSuit = sc.nextLine();
   System.out.println("Enter value");
   int userValue = sc.nextInt();
  
   

boolean b = true;
        for (Card element : magicHand) 
        {
            if(userValue == element.getValue() && userSuit.equalsIgnoreCase(element.getSuit()))
            {
                System.out.println("Your Card is in the list");
                b = false;
            }
        }
       if(b == true)
       {
         System.out.println("Your Card is not in the list");
       }
}
}