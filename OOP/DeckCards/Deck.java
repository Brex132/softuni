package OOP.DeckCards;

public class Deck {
    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
            System.out.println("Ordinal value: "+ suit.ordinal() + "; Name value: " + suit.name());
           // System.out.println(suit.name() + " has ordinal value " + suit.ordinal());
        }
    }
}
