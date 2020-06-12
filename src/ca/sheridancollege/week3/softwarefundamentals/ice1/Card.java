/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Ellie Asadi
//Student Number: 991458861
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author srinivsi
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    // insert two methods to generate random value and suit here
    String createRandomSuit() {
        for(int sub = 0; sub < SUITS.length; sub++) {
            String SUITS = createRandomSuit();
        }
        return "";
    }

    int createRandomValue() {
        for (int sub = 0; sub <= 7; sub++) {
            sub = (int)(Math.random() * 7);
            return sub;  
        }
        return 0;
        
    }
}
$ git push <ellieeEAs> --delete <ellie>