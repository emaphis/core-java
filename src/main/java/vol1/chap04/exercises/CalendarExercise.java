/*
 * Show current month
 * Exercise 4.1
 */
package vol1.chap04.exercises;

import java.time.*;

/**
 *
 * @author emaphis
 */
public class CalendarExercise {

   /**
    * Convert day to Sunday first format:
    * Sun=1,Mon=2,...Sat=7
    * @param day to convert
    * @return converted day
    */
   public static int convDay(int day) {
      if (day == 7) {
         return 1;
      } else {
         return day+1;
      }
   }

   public static void main(String[] args) {
      LocalDate date = LocalDate.now();
      int month = date.getMonthValue();
      int today = date.getDayOfMonth();

      date = date.minusDays(today - 1); // Set to start of month
      DayOfWeek weekday = date.getDayOfWeek();
      int value = convDay(weekday.getValue());  // 1=Sunday,2=Monday, ..., 7=Saturday

      System.out.println("Sun Mon Tue Wed Thu Fri Sat");
      for (int i = 1; i < value; i++) {
         System.out.print("    ");
      }
      while (date.getMonthValue() == month) {
         System.out.printf("%3d", date.getDayOfMonth());
         if (date.getDayOfMonth() == today) {
            System.out.print("*");
         } else {
            System.out.print(" ");
         }
         date = date.plusDays(1);
         if (date.getDayOfWeek().getValue() == 1) {
            System.out.println();
         }
      }
      if (date.getDayOfWeek().getValue() != 1) {
         System.out.println();
      }
   }
}
