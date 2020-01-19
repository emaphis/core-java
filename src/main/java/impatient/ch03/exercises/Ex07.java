/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

/*
In this exercise, you will try out what happens when a method is added
to an interface. In Java 7, implement a class DigitSequence that implements
Iterator<Integer>, not IntSequence. Provide methods hasNext, next, and a donothing
remove. Write a program that prints the elements of an instance.
In Java 8, the Iterator class gained another method, forEachRemaining. Does
your code still compile when you switch to Java 8? If you put your Java 7
class in a JAR file and don’t recompile, does it work in Java 8? What if
you call the forEachRemaining method? Also, the remove method has become
a default method in Java 8, throwing an UnsupportedOperationException. What
happens when remove is called on an instance of your class?
*/

/*
 * Yes, it still runs on JDK 8
 * forEachRemainig is static.
 * nothing happens when 'remove' is called since it has a dummy implementation.
 * Still runs in Java 13.
 */

public class Ex07 {

	public static void main(String[] args) {
		DigitSequence seq = new DigitSequence(13372004);
		seq.remove(); // does nothing
		while (seq.hasNext()) {
			int i = seq.next();
			System.out.println(i);
		}
	}

}
