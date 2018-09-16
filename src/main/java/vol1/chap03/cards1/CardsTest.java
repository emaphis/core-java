/*
 * Chapter 1 Basics
 * Section Cards
 */
package vol1.chap03.cards1;

/**
 * Test the Deck of Cards
 * @author emaphis
 */
public class CardsTest {

   public static void printDeck(Deck deck) {
      for (int suit = Card.DIAMONDS; Card.isSuit(suit); suit++) {
         for (int rank = Card.ACE; Card.isRank(rank); rank++) {
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
