package Midterms;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        CardStack playerDeck = new CardStack();
        CardStack discardPile = new CardStack();
        ArrayList<Card> hand = new ArrayList<>();

        String[] cardNames = {"Noctis", "Gladio", "Archer", "Prompto", "Ignis"};

        for (int i = 0; i < 30; i++) {
            String name = cardNames[rand.nextInt(cardNames.length)];
            playerDeck.push(new Card(name + " #" + (i+1)));
        }

        System.out.println("=== GAME START ===");
        int round = 1;

        while (!playerDeck.isEmpty()) {

            System.out.println("\nPress ENTER to continue to Round " + round + "...");
            scanner.nextLine();

            System.out.println("\n=== ROUND " + round + " ===");

            int command = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;

            if (command == 0) {
                System.out.println("Command: Draw " + x + " card(s)");

                for (int i = 0; i < x; i++) {
                    if (playerDeck.isEmpty()) break;
                    hand.add(playerDeck.pop());
                }

            } else if (command == 1) {
                System.out.println("Command: Discard " + x + " card(s)");

                for (int i = 0; i < x; i++) {
                    if (hand.size() == 0) break;
                    discardPile.push(hand.remove(hand.size() - 1));
                }

            } else {
                System.out.println("Command: Get " + x + " card(s) from discard pile");

                for (int i = 0; i < x; i++) {
                    if (discardPile.isEmpty()) break;
                    hand.add(discardPile.pop());
                }
            }

            System.out.println("\nYour hand:");
            if (hand.size() == 0) System.out.println("No cards.");
            else {
                for (Card c : hand) System.out.println("- " + c);
            }

            System.out.println("\nCards left in deck: " + playerDeck.size());
            System.out.println("Cards in discard pile: " + discardPile.size());

            round++;
        }

        System.out.println("\n=== GAME OVER: Deck is empty ===");
    }

}