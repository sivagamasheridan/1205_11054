package pickacard;

/**
 * Modifier: Ankeet Singh Wason
 * Student ID: 991525855
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
