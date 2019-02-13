package card;

public class Card {

    String cardValues;
    String suit;
    int number;


    public Card(String suit, String cardValues,int number) {
        this.suit = suit;
        this.cardValues = cardValues;
        this.number=number;

    }

    public void setSuit(String suit) {

        this.suit = suit;

    }

    @Override
    public String toString() {
        return  cardValues + "" + suit;
    }
}
    
    

