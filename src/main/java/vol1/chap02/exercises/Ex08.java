/*
 * Write a program that reads a string and prints all of its nonempty
 * substrings.
 */
package vol1.chap02.exercises;

import java.util.Scanner;

/**
 * Find and print substrings.
 * @author emaphis
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string ");
        String str = sc.nextLine();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                System.out.println(sub);
            }
        }
    }
}