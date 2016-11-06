import behaviours.*;

public class Hand extends Deck implements Playable {

  int numberOfCards;
  Playable play;

  public Hand(int numberOfCards) {
    this.numberOfCards = numberOfCards;
  }

  public int play(){
     return 1;
   }


}