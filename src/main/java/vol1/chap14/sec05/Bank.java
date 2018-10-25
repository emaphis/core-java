/*
 * Chapter 14 Concurrency.
 * Section 5 Synchronization.
 */
package vol1.chap14.sec05;

import java.util.Arrays;
import java.util.concurrent.locks.*;

/**
 * Bank simulation of a Bank with a number of bank accounts
 * @author emaphis
 */
public class Bank {
   private final double[] accounts;
   private final Lock bankLock = new ReentrantLock();

   /**
    * Constructs the bank.
    * @param n the number of accounts
    * @param initialBalance the initial balance of each account.
    */
   public Bank(int n, double initialBalance) {
      accounts = new double[n];
      Arrays.fill(accounts, initialBalance);
   }


   /**
    * Transfers money from one account to another
    * @param from the account to transfer from
    * @param to the account to transfer to
    * @param amount the amount to transfer.
    */
   public void transfer(int from, int to, double amount) {
      // CAUTION: unsafe when called from multiple threads
      if (accounts[from] < amount) return;
      bankLock.lock();
      try {
         System.out.println(Thread.currentThread());
         accounts[from] -= amount;
         System.out.printf(" %10.2f from %d to %d", amount, from, to);
         accounts[to] += amount;
         System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
      } finally {
         bankLock.unlock();
      }
   }

   /**
    * Gets the some of all account balances.
    * @return the total balance
    */
   public double getTotalBalance() {
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
