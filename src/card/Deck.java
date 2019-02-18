package card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    static ArrayList<Card> deckOfCards = new ArrayList<>();

    public Deck(int numberOfDecks) {

        createDeck(deckOfCards, numberOfDecks);

    }

    @Override
    public String toString() {
        return "Deck " + "deckOfCards " + deckOfCards;
    }

    public void clear() {
        
        deckOfCards.clear();
    }

    private void createDeck(ArrayList deckOfCard, int numberOfDecks) {
        for (int j = 0; j < numberOfDecks; j++) {

            ArrayList<String> values = new ArrayList<>();
            int number = 1;
            String diamonds = "Diamonds";
            String spades = "Spades";
            String clubs = "Clubs";
            String hearts = "Hearts";
            String ace = "Ace of ";
            String two = "Two of ";
            String three = "Three of ";
            String four = "Four of ";
            String five = "Five of ";
            String six = "Six of ";
            String seven = "Seven of ";
            String eight = "Eight of ";
            String nine = "Nine of ";
            String ten = "Ten of ";
            String jack = "Jack of ";
            String queen = "Queen of ";
            String king = "King of ";
            values.add(ace);
            values.add(two);
            values.add(three);
            values.add(four);
            values.add(five);
            values.add(six);
            values.add(seven);
            values.add(eight);
            values.add(nine);
            values.add(ten);
            values.add(jack);
            values.add(queen);
            values.add(king);

            for (int i = 0; i <= 12; i++) {
                Card newCard;
                if (number >= 10) {
                    number = 10;
                    newCard = new Card(diamonds, values.get(i), number);
                } else if (number == 1) {
                    number = 11;
                    newCard = new Card(diamonds, values.get(i), number);
                    number = 1;
                } else {
                    newCard = new Card(diamonds, values.get(i), number);

                }
                number++;
                deckOfCard.add(newCard);

            }
            number = 1;
            for (int i = 0; i <= 12; i++) {
                Card newCard;
                if (number >= 10) {
                    number = 10;
                    newCard = new Card(spades, values.get(i), number);
                } else if (number == 1) {
                    number = 11;
                    newCard = new Card(spades, values.get(i), number);
                    number = 1;
                } else {
                    newCard = new Card(spades, values.get(i), number);

                }
                number++;
                deckOfCard.add(newCard);

            }
            number = 1;
            for (int i = 0; i <= 12; i++) {
                Card newCard;
                if (number >= 10) {
                    number = 10;
                    newCard = new Card(clubs, values.get(i), number);
                } else if (number == 1) {
                    number = 11;
                    newCard = new Card(clubs, values.get(i), number);
                    number = 1;
                } else {
                    newCard = new Card(clubs, values.get(i), number);

                }
                number++;
                deckOfCard.add(newCard);

            }
            number = 1;
            for (int i = 0; i <= 12; i++) {
                Card newCard;
                if (number >= 10) {
                    number = 10;
                    newCard = new Card(hearts, values.get(i), number);
                } else if (number == 1) {
                    number = 11;
                    newCard = new Card(hearts, values.get(i), number);
                    number = 1;
                } else {
                    newCard = new Card(hearts, values.get(i), number);

                }
                number++;
                deckOfCard.add(newCard);

            }
        }

    }

    public void printDeck() {

        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.print(deckOfCards.get(i));
            System.out.print(" ");
            System.out.println(deckOfCards.get(i).number);

        }

    }

    public void shuffleDeck() {

        Collections.shuffle(deckOfCards);

    }

    public void printNumbers(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size(); i++) {

            System.out.println("");
            System.out.println("");

            System.out.println(deck.get(i).number);
            System.out.print(deck.get(i).cardValues);
            System.out.println(deck.get(i).suit);
            System.out.println("");

            System.out.println("");

        }

    }

    public int size() {
        int size = 0;
        for (int i = 0; i < deckOfCards.size(); i++) {

            size++;

        }

        return size;

    }

}
