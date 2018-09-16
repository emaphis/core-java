/*
 * Chapter 1 Basics
 * Section Cards
 */
package vol1.chap03.cards1;

/**
 * Represents a deck of 52 cards
 * @author emaphis
 */
public class Deck {
   public static int numSuits = Card.SPADES;
   public static int numRanks = Card.KING;

   private final Card[][] deck = new Card[numSuits][numRanks];

   public Deck() {
      for (int suit = Card.DIAMONDS; Card.isSuit(suit); suit++) {
         for (int rank = Card.ACE; Card.isRank(rank); rank++) {
            deck[suit-1][rank-1] = new Card(rank, suit);
         }
      }
   }

    public Card getCard(int suit, int rank) {
      Card card = deck[suit-1][rank-1];
      if (card.isCard())
         return card;
      else
         return null;
    }
}
