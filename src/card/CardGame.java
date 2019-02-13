package card;



public class CardGame {

    public CardGame() {
        
        Deck d = new Deck();
        d.shuffleDeck();
        
        new Menu();
        
      
    }

    public static void main(String[] args) {
        
        new CardGame();
        
    }

    public void printCards() {

    }

}
