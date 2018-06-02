/*
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API. 
 */
package vol1.chap02.exercises;

/**
 * Print the largest and smallest positive double values
 * @author emaphis
 */
public class Ex04 {
    public static void main(String[] args) {
        double max = Math.nextDown(Double.MAX_VALUE);
        System.out.println("Max Double: " + max);

        double min = Math.nextUp(0.0);
        System.out.println("Min Double: " + min);
    }
 
}
