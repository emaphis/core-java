/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 8
 */
package impatient.ch04.exercises;

/*
The Class class has six methods that yield a string representation of the
type represented by the Class object. How do they differ when applied to
arrays, generic types, inner classes, and primitive types?
 */

class Generic<T> {
   private T t1;
   public Generic(T t) {
      this.t1 = t;
   }

   public T getVal() {
      return t1;
   }
}


class OuterClass {
   private int num;
   public OuterClass(int i) { this.num = i; }

   public InnerClass getInnerClass(int i) {
      return new InnerClass(i);
   }

   public class InnerClass {
      private int i;
      public InnerClass(int i) { this.i = i; }
      public int geI() { return i; }
   }
}

public class Ex08 {

   public static void main(String[] args) {
      Generic<Integer> generic = new Generic<>(10);
      System.out.println("Generic class: ");
      printClassNames(generic.getClass());

      int[] intArray = new int[]{1, 2, 3, 4};
      System.out.println("Int Array:");
      printClassNames(intArray.getClass());

      OuterClass outer = new OuterClass(10);
      System.out.println("Simple Class: ");
      printClassNames(outer.getClass());

      OuterClass.InnerClass inner =  outer.getInnerClass(10);
      System.out.println("Simple Inner Class: ");
      printClassNames(inner.getClass());

      Class<?>  cls = int.class;
      System.out.println("Primative type int: ");
      printClassNames(cls);

   }

   static void printClassNames(Class<?> cls) {
      //Class<?> cls = obj.getClass();
      System.out.println("getCanonicalName(): " + cls.getCanonicalName());
      System.out.println("getSimpleName():    " + cls.getSimpleName());
      System.out.println("getTypeName():      " + cls.getTypeName());
      System.out.println("getName():          " + cls.getName());
      System.out.println("toString():         " + cls.toString());
      System.out.println("toGenericString():  " + cls.toGenericString());
   }

}
