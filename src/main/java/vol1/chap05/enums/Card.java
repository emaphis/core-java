/*
 * Chapter 1 Basics
 * Section Cards
 */
package vol1.chap05.enums;

/**
 * Represent a playing card
 * @author emaphis
 */
public class Card {
   private final Rank rank;
   private final Suit suit;

   public Card(Rank rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
   }

   public static String rankToString(Rank rank) {
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

   public static String suitToString(Suit suit) {
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

   public Rank getRank() { return rank; }
   public Suit getSuit() { return suit; }
}
