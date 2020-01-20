/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Inheritance and Default Methods
 */
package impatient.ch04.sec01;

/**
 * @author emaphis
 */
public interface Named {
   default String getNamed() { return ""; }
}
