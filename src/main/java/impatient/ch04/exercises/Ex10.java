/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 10
 */
package impatient.ch04.exercises;

import impatient.ch04.sec05.MethodPrinter;

/*
Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members”
(page 168) to enumerate all methods of the int[] class. Extra credit if you
can identify the one method (discussed in this chapter) that is wrongly
described.
*/

/**
 * @author emaphis
 */
public class Ex10 {

   public static void main(String[] args) {
      int[] array = new int[3];
      MethodPrinter.printMethod(array.getClass());
   }
}

/*
protected void finalize[]
public final native void wait[long arg0]
public final void wait[long arg0, int arg1]
public final void wait[]
public boolean equals[java.lang.Object arg0]
public java.lang.String toString[]
public native int hashCode[]
public final native java.lang.Class getClass[]
protected native java.lang.Object clone[]
public final native void notify[]
public final native void notifyAll[]
private static native void registerNatives[]
*/