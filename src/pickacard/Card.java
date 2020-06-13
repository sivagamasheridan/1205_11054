/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickacard;

/**
 *
 * @author srinivsi
  *
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
public class Card 
{
  private String suit;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
    
    public String getSuit()
    {
        return suit;
    }

    
    public void setSuit(int num) 
    {
        this.suit = SUITS[num];
    }
    
    public int randomSuit()
    {
        return (int)(Math.random()*4);
    }
    
    public int getValue() 
    {
        return value;
    }

    
    public void setValue(int value) 
    {
        this.value = value;
    }
    public int randomValue()
    {
       return (int)(Math.random()*(13)+1);
       
   }
   
}