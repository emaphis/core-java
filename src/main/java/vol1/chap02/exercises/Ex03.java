/*
 * Find largest of three numbers.
 */
package vol1.chap02.exercises;

import java.util.Scanner;

/**
 * Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max.
 * 
 * @author emaphis
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int int_1 = in.nextInt();
        int int_2 = in.nextInt();
        int int_3 = in.nextInt();

        int max_1 = (int_1 > int_2) ? int_1 : (int_2 > int_3) ? int_2 :  int_3;
        System.out.println("Greatest integer: " + max_1);

        int max_2 = Math.max(int_1, Math.max(int_2, int_3));
        System.out.println("And: " + max_2); 
    }
}
