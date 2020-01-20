/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * Loading Services
 */
package impatient.ch04.sec04.impl;

import impatient.ch04.sec04.Cipher;

/**
 * @author emaphis
 */
public class AESCipherFactory {
   public static Cipher provider() { return new AESCipher(); }
}
