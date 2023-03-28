package OOP.CardRank;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("Card Ranks")) {
            for (CardRank rank : CardRank.values()) {
                System.out.println("Ordinal value: "+ rank.ordinal() + "; Name value: " + rank.name());
            }
        }

    }
}
