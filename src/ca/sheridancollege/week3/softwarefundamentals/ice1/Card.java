/*
 * Student Id: 991585410
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * modifier: Bhagesh Bhagesh
 * @author srinivsi
 */
public class Card {

   private String suits;//diamonds,clubs,spades, hearts
    private int value; // 1 to 13
    public static final String[] SUITS = {"Diamonds", "Clubs", "Spades", "Hearts"};

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int randomValue() {
        int value = (int) (Math.random() * 13 + 1);
        return value;
    }

    public int randomSuit() {
        int suit = (int) (Math.random() * 4);
        return suit;
    }
}
