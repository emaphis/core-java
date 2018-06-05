/*
 * What happens when you cast a double to an int that is larger than the
 * largest possible int value? Try it out.
 */
package vol1.chap03.exercises;

/**
 * Larger than large
 * @author emaphis
 */
public class Ex05 {
    public static void main(String[] args) {
        int large = Integer.MAX_VALUE;
        System.out.println("Largerest int: " + large);
        double larger = (double)large + 1111111111.0;
        System.out.println("Larger than large: " + larger);
        int ohOh = (int) larger;
        System.out.println("Back to int: " + ohOh);
        // Wow, I guess you can't cast from Double to Intger and back.
    }
}
