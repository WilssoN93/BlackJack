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
        deck = new Deck(2);
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

//    @Test
//    public void testDeck() {
//
//        assertEquals(100, d.size());
//
//    }
    
    @Test
    public void testClear(){
        
        deck.clear();
    assertEquals(0,deck.size());
    
    }
    
    

}
