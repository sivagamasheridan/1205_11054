package pickacard;

import java.util.Random;

public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13
    Random random = new Random();

    public static final String[] SUITS = {"hearts", "diamonds", "spades", "clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String randomSuit() {
        return (SUITS[random.nextInt(4)]);
    }

    public int randomNumber() {
        return (random.nextInt(13) + 1);
    }

}
