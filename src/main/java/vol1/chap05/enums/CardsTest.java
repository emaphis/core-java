/*
 * Chapter 5 Enums
 * Section Cards
 */
package vol1.chap05.enums;


/**
 * Test the Deck of Cards
 * @author emaphis
 */
public class CardsTest {

   public static void printDeck(Deck deck) {
      for (Suit suit : Suit.values()) {
         for (Rank rank : Rank.values()) {
            System.out.println(Card.rankToString(rank) +" of " + Card.suitToString(suit));
         }
      }
   }

   public static void main(String[] args) {
      Deck deck = new Deck();
      printDeck(deck);
      //for (int i = 0; i < 16; i++) {
      //   System.out.println("i=" + i + ",rank=" + Card.isRank(i) + ",suit=" + Card.isSuit(i));
      //}
   }
}
