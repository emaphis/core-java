/*
 * Chapter 14 Concurrency.
 * Section 5 Synchronization.
 */
package vol1.chap14.sec05;

import java.util.Arrays;
import java.util.concurrent.locks.*;

/**
 * Bank simulation of a Bank with a number of bank accounts
 * with synchronization primatives.
 * @author emaphis
 */
public class SynchBank2 {
   private final double[] accounts;

   /**
    * Constructs the bank.
    * @param n the number of accounts
    * @param initialBalance the initial balance of each account.
    */
   public SynchBank2(int n, double initialBalance) {
      accounts = new double[n];
      Arrays.fill(accounts, initialBalance);
   }


   /**
    * Transfers money from one account to another
    * @param from the account to transfer from
    * @param to the account to transfer to
    * @param amount the amount to transfer.
    * @throws java.lang.InterruptedException
    */
   public synchronized void transfer(int from, int to, double amount)
      throws InterruptedException {
         while (accounts[from] < amount)
            wait();
         System.out.println(Thread.currentThread());
         accounts[from] -= amount;
         System.out.printf(" %10.2f from %d to %d", amount, from, to);
         accounts[to] += amount;
         System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
         notifyAll();
   }

   /**
    * Gets the some of all account balances.
    * @return the total balance
    */
   public synchronized double getTotalBalance() {
      double sum = 0.0;

      for (double a : accounts) {
         sum += a;
      }
      return sum;
   }

   /**
    * Gets the number of accounts in the bankl
    * @return
    */
   public int size() {
      return accounts.length;
   }
}
