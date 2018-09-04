/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.core.java;

import java.util.function.IntSupplier;

/**
 *
 * @author emaphis
 */
public class SimpleClosure {
   public static void main(String[] args) {
      // function with now arguments
      IntSupplier ans = () -> 42;
      int answer = ((IntSupplier)(()-> 42)).getAsInt();
      System.out.println("ans=" + ans.getAsInt() + ",answer=" + answer);
   }
}
