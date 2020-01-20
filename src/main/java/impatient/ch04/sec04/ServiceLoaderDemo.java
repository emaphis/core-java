/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * Loading Services
 */
package impatient.ch04.sec04;

import java.util.ServiceLoader;
import java.util.Optional;
import java.io.UnsupportedEncodingException;

/**
 * @author emaphis
 */
public class ServiceLoaderDemo {
   public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

   public static void main(String[] args) throws UnsupportedEncodingException {
      int strength = args.length == 0 ? 1 : Integer.parseInt(args[0]);
      Cipher cipher = getCipher(strength);
      String message = "Meet me at the party";
      byte[] bytes = cipher.encrypt(message.getBytes(),
            new byte[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3});
      String encryptd = new String(bytes, "UTF-8");
      System.out.println(encryptd);
   }

   public static Cipher getCipher(int minStrengh) {
      for (Cipher cipher : cipherLoader) {
         if (cipher.strength() >= minStrengh) return cipher;
      }
      return null;
   }

   public static Optional<Cipher> getCipher2(int minStrength) {
      return cipherLoader.stream()
            .map(ServiceLoader.Provider::get)
            .filter(c -> c.strength() >= minStrength)
            .findFirst();
   }
}
