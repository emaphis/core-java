/*
 * Chapter 1 Basics
 * Section Cards
 */
package vol1.chap05.enums;

/**
 * Represents a deck of 52 cards
 * @author emaphis
 */
public class Deck {
   public static int numSuits = Suit.values().length;
   public static int numRanks = Rank.values().length;

   private final Card[] deck = new Card[numSuits * numRanks];

   public Deck() {
      int i = 0;
      for (Suit suit : Suit.values()) {
         for (Rank rank : Rank.values()) {
            deck[i++] = new Card(rank, suit);
         }
      }
   }

    public Card getCard(Suit suit, Rank rank) {
      return deck[suit.ordinal() * rank.ordinal()];
    }
}
