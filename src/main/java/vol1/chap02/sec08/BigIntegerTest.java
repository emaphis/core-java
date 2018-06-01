/*
 * Example code for BigInteger class
 */
package vol1.chap02.sec08;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculate Lottery Odds
 * @author emaphis
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need? ");
        int k = in.nextInt();

        System.out.print("What is the highest number? ");
        int n = in.nextInt();

        // compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 0; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                           BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + " , Good luck!");
    }
}
