/*
 * Angle handleing program.
 */
package vol1.chap03.exercises;

import java.util.Scanner;

/**
 *  Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod.
 * 
 * @author emaphis
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter angle to normalize: ");
        int angle = in.nextInt();

        int normal_1 = angle % 360;
        System.out.println("Normal angle 1: " + normal_1);

        int normal_2 = Math.floorMod(angle, 360);
        System.out.println("Normal agnle 2: " + normal_2);
    }
}
