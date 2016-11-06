import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

Player player1;
Player player2;
Hand hand1;
Hand hand2;

@Before 
public void before(){
  player1 = new Player("Cyrus");
  player2 = new Player("John");
  hand1 = new Hand(CardValue.SIX, CardSuit.SPADES);
  hand1 = new Hand(CardValue.TWO, CardSuit.CLUBS);
} 

@Test void playerName(){
  assertEquals("Cyrus", player1.getName());
}

}