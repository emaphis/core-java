/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * Loading Services
 */
package impatient.ch04.sec04.impl;

import impatient.ch04.sec04.Cipher;

/**
 *
 * @author emaphis
 */
public class CeaserCipher implements Cipher {

   @Override
   public byte[] encrypt(byte[] source, byte[] key) {
      byte[] result = new byte[source.length];
      for (int i = 0; i < source.length; i++) {
         result[i] = (byte)(source[i] + key[0]);
      }
      return result;
   }

   @Override
   public byte[] decrypt(byte[] source, byte[] key) {
      return encrypt(source, new byte[] {(byte) -key[0]});
   }

   @Override
   public int strength() { return 1; }

}
