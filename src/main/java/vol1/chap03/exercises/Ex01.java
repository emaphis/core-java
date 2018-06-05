/*
 * Read in an integer and print out in different formats.
 */
package vol1.chap03.exercises;

import java.util.Scanner;

/**
 *  Write a program that reads an integer and prints it in binary, octal, and
 *  hexadecimal. Print the reciprocal as a hexadecimal floating-point number. 
 * @author emaphis
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to convert: ");
        int num = in.nextInt();
  
        System.out.printf("Number in Binary: %s\n", Integer.toString(num, 2));
        System.out.printf("Number in Octal: %s\n", Integer.toString(num, 8));
        System.out.printf("Number in Hexadecimal: %s\n", Integer.toString(num, 16));
        System.out.printf("Number as a Hexadecimal Reciprocal: %s\n", Double.toHexString(1.0/num));
    }
            
}
