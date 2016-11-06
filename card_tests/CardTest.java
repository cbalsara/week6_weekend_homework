import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {
Card testingCard;

@Before
public void before(){
  testingCard = new Card( QUEEN, String.DIAMONDS);
}

@Test 
public void hasValue(){
  assertEquals(QUEEN, testingCard.getCardValue());
}

@Test 
public void hasSuit(){
  assertEquals(String.DIAMONDS, testingCard.getCardSuit());
}














}