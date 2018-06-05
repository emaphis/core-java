/*
 * String examples
 */
package vol1.chap03.sec06;

/**
 * Strings
 * @author emaphis
 */
public class Strings1 {
    public static void main(String[] args) {
        // Substrings 
        String greetings = "Hello";
        String s = greetings.substring(0, 3);  // "Hel"
        System.out.println("Hel = " + s);
        
        // Concatenation with '+'
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println("message: " + message);

        // Strings are immutable
        String newGreetins = greetings.substring(0,3) + "p!";  // Help!
        System.out.println(newGreetins);
        System.out.println(greetings);

        // Testing for equality
        System.out.println("Hello".equals(greetings));  // true
        // Ignoring case
        System.out.println("Hello".equalsIgnoreCase("hello"));  // true
    }
}
