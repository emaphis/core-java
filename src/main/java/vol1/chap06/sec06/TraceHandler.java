/*
 * Chap 6 Sec 6 - Inner classes
 * Proxies
 */
package vol1.chap06.sec06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * An invocation handler that prints out the method name and parameters, then
 * invokes the original method.
 * @author emaphis
 */
public class TraceHandler implements InvocationHandler {
   private Object target;

   /**
    * Constructs a TraceHandler
    * @param t the implicit parameter of the method call
    */
   public TraceHandler(Object t) {
      target = t;
   }

   @Override
   public Object invoke(Object proxy, Method m, Object[] args)
         throws Throwable {
      // print method name and parmeters
      System.out.print(target);
      System.out.print("." + m.getName() + "(");
      // print explicit arguements
      if (args != null) {
         for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) System.out.println(", ");
         }
      }
      System.out.println(")");

      // inoke actual method
      return m.invoke(target, args);
   }
}
