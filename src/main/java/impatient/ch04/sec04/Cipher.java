/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * Loading Services
 */
package impatient.ch04.sec04;

/**
 *
 * @author emaphis
 */
public interface Cipher {
   byte[] encrypt(byte[] source, byte[] key);
   byte[] decrypt(byte[] source, byte[] key);
   int strength();
}
