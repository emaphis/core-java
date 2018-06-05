/*
 * Input Output handling
 */
package vol1.chap03.sec07;

import java.util.Scanner;

/**
 * I/O
 * @author emaphis
 */
public class InputOutput {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Retrieving a whole line.
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);

        // Retrievine on word.
        System.out.println("What is your first name?");
        String first = in.next();
        System.out.println("Hello, " + first);

        // Read and integer
        System.out.println("How old are your?");
        int age = in.nextInt();
        System.out.println("Age: " + age);
    }
    
}
