/*
 * Chapter 6 Classes
 * Section Local Classes
 */
package vol1.chap06.inner_class;

/**
 *
 * @author emaphis
 */
public class LocalClassExample {

   static String regularExpression = "[^0-9]";

   public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

      int numberLength = 10;

      class PhoneNumber {

         String formattedPhoneNumber = null;

         PhoneNumber(String phoneNumber) {
            // number lengh = 7
            String currentNumber = phoneNumber.replaceAll(regularExpression, "");
            if (currentNumber.length() == numberLength)
               formattedPhoneNumber = currentNumber;
            else
               formattedPhoneNumber = null;
         }

         public String getNumber() {
            return formattedPhoneNumber;
         }

         public void printOriganalNumbers() {
            System.out.println("Original numbere are " + phoneNumber1 +
                  " and " + phoneNumber2);
         }
      }

      PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
      PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

      myNumber1.printOriganalNumbers();


      if (myNumber1.getNumber() == null)
         System.out.println("First number is invalid");
      else
         System.out.println("First number is " + myNumber1.getNumber());

      if (myNumber2.getNumber() == null)
         System.out.println("Second number is invalid");
      else
         System.out.println("Second number is " + myNumber2.getNumber());
   }

   public static void main(String[] args) {
      validatePhoneNumber("123-456-7890", "456-7890");
   }
}
