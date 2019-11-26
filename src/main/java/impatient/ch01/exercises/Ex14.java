package impatient.ch01.exercises;

/*
 * Exercises Chapter 1
 * Ex14.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercise 14.
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all
 * rows, all columns, and the diagonals is the same). Accept lines of input
 * that you break up into individual integers, and stop when the user enters
 * a blank line. For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 8 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively
 * @author emaphis
 */
public class Ex14 {
   public static void main(String[] args) {
      ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();
      Scanner in = new Scanner(System.in);
      boolean ret = false;
      int size = 0;

      // load square
      System.out.println("Enter the square 'end' to quit: ");
      while (in.hasNext()) {
         String line = in.nextLine();
         // break on 'end'
         if (line.equals("end")) break;

         String[] elements = line.split(" ");
         ArrayList<Integer> nums = new ArrayList<>();
         for (String str : elements) {
            nums.add(Integer.parseInt(str));
         }
         square.add(nums);
         size++;
      }

      System.out.println("square: " + square.toString());
   }
}
