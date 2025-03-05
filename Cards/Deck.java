import java.util.*;

class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);  
    }

    // Print two random cards from the deck
    public void randomCards() {
        Random rand = new Random();
        int index1 = rand.nextInt(deck.size());
        int index2;
        // Ensure the second card is not the same as the first
        do {
            index2 = rand.nextInt(deck.size());
        } while (index2 == index1);
        
        System.out.println("Two random cards from the deck:");
        System.out.println(deck.get(index1));
        System.out.println(deck.get(index2));
    }

    // Create 3 players and distribute 5 cards to each at random and display cards of all players
    public void cardPlayers() {
        // Shuffle the deck before dealing cards
        shuffleDeck();
        
        // Create 3 players and deal 5 cards to each
        ArrayList<ArrayList<Card>> players = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            ArrayList<Card> playerCards = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                // Remove a card from the deck and add it to the player's hand
                playerCards.add(deck.remove(0));
            }
            players.add(playerCards);
        }

        // Display cards of all players
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    // New method: sameCard() - Find cards with the same suit as the given card
    public void sameCard(String suit) {
        System.out.println("Cards with suit " + suit + ":");
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // New method: compareCard() - Find cards with the same rank as the given rank
    public void compareCard(String rank) {
        System.out.println("Cards with rank " + rank + ":");
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // New method: findCard() - Search for a specific card by rank and suit
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Found: " + card);
                return true;
            }
        }
        System.out.println("Card " + rank + " of " + suit + " not found in the deck.");
        return false;
    }

    // New method: dealCard() - Print 5 random cards without removing them
    public void dealCard() {
        shuffleDeck(); // Shuffle before dealing
        Random rand = new Random();
        ArrayList<Integer> indices = new ArrayList<>();
        
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            int index;
            do {
                index = rand.nextInt(deck.size());
            } while (indices.contains(index)); // Ensure no duplicates
            indices.add(index);
            deck.get(index).printCard(); // Use the new printCard() method
        }
    }
}