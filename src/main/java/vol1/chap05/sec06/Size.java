/*
 * Chapter 5 Inheritance
 * Section 6 Enums
 * Example Enum
 */

package vol1.chap05.sec06;

/**
 * Size Enumeration
 * @author emaphis
 */
public enum Size {
   SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

   private final String abbreviation;

   private Size(String abbreviation) { this.abbreviation = abbreviation; }
   public String getAbbreviation() { return abbreviation; }
}
