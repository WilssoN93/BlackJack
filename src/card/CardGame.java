package card;

public class CardGame {
    Menu m;

    public CardGame() {

        
        Deck d = new Deck(4);
        d.shuffleDeck();
        m = new Menu();
        //d.printDeck();
        //System.out.println(d.size());

    }

    public static void main(String[] args) {

        new CardGame();

    }

    public void printCards() {

    }

}
