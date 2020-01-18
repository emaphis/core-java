/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 6 Processing Lambda Expressions
 * Implementing Your Own Functional Interfaces
 */
package impatient.ch03.sec06;

import java.awt.Color;

/**
 * A custom functional interface
 * @author emaphis
 */
@FunctionalInterface
public interface PixelFunction {
   Color apply(int x, int y);
}
