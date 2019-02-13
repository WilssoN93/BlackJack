package card;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> hand;

    public Hand() {

        createHand();
    }

    public void createHand() {
        hand = new ArrayList();
        for (int i = 0; i <= 1; i++) {

            hand.add(Deck.deckOfCards.get(i));
            Deck.deckOfCards.remove(i);

        }

    }

    public void clear(ArrayList<Card> hand) {

        hand.removeAll(hand);

    }

    public void printHand(ArrayList<Card> hand) {

        if (hand != null) {
            for (int i = 0; i < hand.size(); i++) {
                System.out.print(hand.get(i) + ": ");
                System.out.println(hand.get(i).number);

            }
        } else {
            System.out.println("You have no cards in hand");
        }

    }

    public void printFirstCard(ArrayList<Card> hand) {
        System.out.print(hand.get(0) + ": ");
        System.out.println(hand.get(0).number);

    }

    public void addCard() {
        try {
            hand.add(Deck.deckOfCards.get(0));
            Deck.deckOfCards.remove(Deck.deckOfCards.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("det finns inga kort kvar i leken");
        }

    }

    public void newCards(ArrayList<Card> hand) {

        try {
            hand.clear();
            for (int i = 0; i <= 1; i++) {

                hand.add(Deck.deckOfCards.get(i));
                Deck.deckOfCards.remove(i);

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("det finns inga kort kvar");

        }
    }

    public int handScore() {

        int sumHand = 0;
        for (int i = 0; i < hand.size(); i++) {
            sumHand += hand.get(i).number;

        }
        return sumHand;
    }

    public int getHandSize() {
        return hand.size();

    }

    public void dealerActions(ArrayList<Card> hand) {

        do {
            this.addCard();
        } while (handScore() < 17);

    }

    public String checkScores(Hand hand) {
        String result = "You Loose";

        if (hand.handScore() > 22) {

            return "You win!";

        } else if (this.handScore() > 22) {

            return result;
        } else if (this.handScore() >= hand.handScore()) {

            result = "You win!";

        }

        return result;
    }

    public String checkScore() {

        if (this.handScore() > 22) {
            return "You loose";
        }
        return "=====================";
    }
}
