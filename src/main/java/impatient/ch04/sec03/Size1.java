/*
 * Chapter 4 Inheritance and Reflection
 * Sec 3 Enumerations
 * Constructors, Methods, and Fields
 */
package impatient.ch04.sec03;

/**
 * @author emaphis
 */
public enum Size1 {
   SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

   private String abbreviation;

   private Size1(String abbreviation) {
      this.abbreviation = abbreviation;
   }

   public String getAbbreviation() { return abbreviation; }
}
