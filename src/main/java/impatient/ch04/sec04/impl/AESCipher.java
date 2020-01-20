/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * Loading Services
 */

package impatient.ch04.sec04.impl;

import impatient.ch04.sec04.Cipher;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author emaphis
 */
public class AESCipher implements Cipher {

   @Override
   public byte[] encrypt(byte[] source, byte[] key) {
      SecretKey skey = new SecretKeySpec(key, "AES");
      javax.crypto.Cipher cipher;
      try {
         cipher = javax.crypto.Cipher.getInstance("AES");
         cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, skey);
         return cipher.doFinal(source);
      } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
         throw new RuntimeException(ex);
      }
   }

   @Override
   public byte[] decrypt(byte[] source, byte[] key) {
      SecretKey skey = new SecretKeySpec(key, "AES");
      javax.crypto.Cipher cipher;
      try {
         cipher = javax.crypto.Cipher.getInstance("AES");
         cipher.init(javax.crypto.Cipher.DECRYPT_MODE, skey);
         return cipher.doFinal(source);
      } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
         throw new RuntimeException(ex);
      }
   }

   @Override
   public int strength() {
      return 10;
   }

}
