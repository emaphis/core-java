/*
 * Chapter 1 Basics
 * Section Cards
 */
package vol1.chap03.cards1;

/**
 * Represent a playing card
 * @author emaphis
 */
public class Card {
   private final int rank;
   private final int suit;

   public Card(int rank, int suit) {
      if (!isRank(rank) && (!isSuit(suit))) {
         this.rank = -1;
         this.suit = -1;
      } else {
         this.rank = rank;
         this.suit = suit;
      }
   }

   // ranks
   public static final int ACE   = 1;
   public static final int DEUCE = 2;
   public static final int THREE = 3;
   public static final int FOUR  = 4;
   public static final int FIVE  = 5;
   public static final int SIX   = 6;
   public static final int SEVEN = 7;
   public static final int EIGHT = 8;
   public static final int NINE  = 9;
   public static final int TEN   = 10;
   public static final int JACK  = 11;
   public static final int QUEEN = 12;
   public static final int KING  = 13;

   public static final boolean isRank(int rank) {
      return rank >= ACE && KING >= rank;
   }

   public static String rankToString(int rank) {
       switch (rank) {
       case ACE:
           return "Ace";
       case DEUCE:
           return "Deuce";
       case THREE:
           return "Three";
       case FOUR:
           return "Four";
       case FIVE:
           return "Five";
       case SIX:
           return "Six";
       case SEVEN:
           return "Seven";
       case EIGHT:
           return "Eight";
       case NINE:
           return "Nine";
       case TEN:
           return "Ten";
       case JACK:
           return "Jack";
       case QUEEN:
           return "Queen";
       case KING:
           return "King";
       default:
           return null;
       }
   }

    // suits
    public static final int DIAMONDS = 1;
    public static final int CLUBS    = 2;
    public static final int HEARTS   = 3;
    public static final int SPADES   = 4;

   public static final boolean isSuit(int suit) {
      return suit >= DIAMONDS && SPADES >= suit;
   }

   public static String suitToString(int suit) {
      switch (suit) {
      case DIAMONDS:
          return "Diamonds";
      case CLUBS:
          return "Clubs";
      case HEARTS:
          return "Hearts";
      case SPADES:
          return "Spades";
      default:
          return null;
      }
   }


   public boolean isCard() {
      return isRank(rank) && isSuit(suit);
   }

   public int getRank() { return rank; }
   public int getSuit() { return suit; }
}
