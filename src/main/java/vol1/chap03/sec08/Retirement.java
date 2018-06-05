/*
 * Flow control example
 */
package vol1.chap03.sec08;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class Retirement {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in); 

        System.out.println("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.println("How much will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0.0;
        int years = 0;

        // update account ballance while goal isn't reached
        while (balance < goal) {
            // add this years payment
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " Years.");
    }
}
