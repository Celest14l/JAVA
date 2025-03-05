public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.createDeck();
        
        System.out.println("----- Original Deck -----");
        deck.displayDeck();  // Display the original deck

        System.out.println("\n----- Shuffled Deck -----");
        deck.shuffleDeck();  // Shuffle the deck
        deck.displayDeck();  // Display the shuffled deck

        System.out.println("\nTwo random cards:");
        deck.randomCards();

        System.out.println("\nDistributing cards to 3 players:");
        deck.cardPlayers();

        // Demonstrating new methods
        System.out.println("\n----- Testing sameCard (Hearts) -----");
        deck.createDeck(); // Recreate deck to ensure it's full
        deck.sameCard("Hearts");

        System.out.println("\n----- Testing compareCard (A) -----");
        deck.compareCard("A");

        System.out.println("\n----- Testing findCard (Ace of Spades) -----");
        deck.findCard("A", "Spades");

        System.out.println("\n----- Testing dealCard (5 random cards) -----");
        deck.dealCard();
    }
}