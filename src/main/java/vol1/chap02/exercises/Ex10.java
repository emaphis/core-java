/*
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 */
package vol1.chap02.exercises;

import java.util.Random;

/**
 * Random string
 * @author emaphis
 */
public class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        long num = rand.nextLong();
        String str = Long.toString(num, 36);
        System.out.println("Num: " + num + " it's string: " + str);
    }
}
