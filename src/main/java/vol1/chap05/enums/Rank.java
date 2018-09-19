/*
 * Chapter 6 Classes
 * Section vol1.chap03.cards1
 */
package vol1.chap05.enums;

/**
 *
 * @author emaphis
 */
public enum Rank {
   //int rank;

    ACE(1),
    DEUCE(2),
    THREE (3),
    FOUR  (4),
    FIVE  (5),
    SIX   (6),
    SEVEN (7),
    EIGHT (8),
    NINE  (9),
    TEN   (10),
    JACK  (11),
    QUEEN (12),
    KING  (13);

    int num;
    Rank(int i) {
      num = i;
    }
}
