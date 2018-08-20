/*
 * Chapter 6 sec 6 inner classes
 * Proxies
 */
package vol1.chap06.sec06;

import java.lang.reflect.*;
import java.util.*;

/**
 * Test the proxy class
 * @author emaphis
 */
public class ProxyTest {
   public static void main(String[] args) {
      Object[] elements = new Object[1000];

      // fill elements wiht proxies for the integers 1 ... 1000
      for (int i = 0; i < elements.length; i++) {
         Integer value = i + 1;
         InvocationHandler handler = new TraceHandler(value);
         Object proxy = Proxy.newProxyInstance(null, new Class[] { Comparable.class}, handler);
         elements[i] = proxy;
      }

      // construct a random integer
      Integer key = new Random().nextInt(elements.length) + 1;

      // search for the key
      int result = Arrays.binarySearch(elements, key);

      // pring match if found
      if (result >= 0) System.out.println(elements[result]);
   }
}
