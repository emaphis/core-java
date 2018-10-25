/*
 * Chapter 14 Concurrency.
 * Section 5 Synchronization
 */
package vol1.chap14.sec05;

/**
 * This program shows data corruption when multiple threads access a data structure
 * @author emaphis
 */
public class UnsynchBankTest {

   public static final int NACCOUNTS = 100;
   public static final double INITIAL_BALANCE = 1000.0;
   public static final double MAX_AMOUNT = 1000.0;
   public static final int DELAY = 10;

   public static void main(String[] args) {
      var bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
      for (int i = 0; i < NACCOUNTS; i++) {
         int fromAccount = i;
         Runnable r = () -> {
            try {
               while (true) {
                  int toAccount = (int) (bank.size() * Math.random());
                  double amount = MAX_AMOUNT * Math.random();
                  bank.transfer(fromAccount, toAccount, amount);
                  Thread.sleep((int) (DELAY * Math.random()));
               }
            }
            catch (InterruptedException e) {
            }
         };

         Thread t = new Thread(r);
         t.start();
      }
   }
}
