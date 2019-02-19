package card;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand h;
    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck(1);
        h = new Hand();
    }

    @After
    public void after() {
       deck.clear();
    }

    @Test
    public void testCreateHand() {

        assertEquals(2, h.getHandSize());

    }

    @Test
    public void testNewCards() {

        h.newCards(h.hand);

        assertEquals(2, h.getHandSize());

    }

    @Test
    public void testAddCard() {

        h.addCard();
        assertEquals(3, h.getHandSize());

    }

    @Test
    public void testAces() {
        h.clear(h.hand);

        Card aceOne = new Card("Diamonds", "Ace of ", 11);
        Card aceTwo = new Card("Spades", "Ace of ", 11);
        h.hand.add(aceTwo);
        h.hand.add(aceOne);

        h.aceChange(h.hand);
        assertEquals(12, aceOne.number + aceTwo.number);

    }

    @Test
    public void testDeckSize() {  

        assertEquals(50, deck.size());

    }
    
    @Test
    public void testClear(){
        
        deck.clear();
    assertEquals(0,deck.size());
    
    }
    
    @Test
    public void testHandScore(){
    
    h.clear(h.hand);
    
    Card cardOne = new Card("Diamonds","King of ",10);
    Card cardTwo = new Card("Spades","Eight of ",8);
    Card cardTree = new Card("Spades","Six of ",6);
    Card cardFour = new Card("Spades","Five of ",5);
    Card cardFive = new Card("Spades","Two of ",2);
    Card cardSix = new Card("Spades","Ten of ",10);
    
    h.hand.add(cardOne);
    h.hand.add(cardTwo);
    h.hand.add(cardTree);
    h.hand.add(cardFour);
    h.hand.add(cardFive);
    h.hand.add(cardSix);
    
    assertEquals(41,h.handScore());
        
    }
    
    

}
