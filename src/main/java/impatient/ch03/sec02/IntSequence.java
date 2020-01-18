/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 2 Static, Default, and Private Methods
 * Defualt Methods
 * IntSequence.java
 */
package impatient.ch03.sec02;

/**
 *
 * @author emaphis
 */
public interface IntSequence {
   default boolean hasNext() { return true; }
   // by defualt, sequences are infinite.
   int next();
}
