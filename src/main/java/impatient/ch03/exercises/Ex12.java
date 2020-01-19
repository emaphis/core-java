/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/*
Using the list(FilenameFilter) method of the java.io.File class, write a method
that returns all files in a given directory with a given extension. Use a
lambda expression, not a FilenameFilter. Which variable from the enclosing
scope does it capture?
 */

// The lambda captures the fileExtension variable.

/**
 * @author emaphis
 */
public class Ex12 {

   public static void main(String[] args) {
      List<String> fileNames = getFilesByExtension("src\\main\\java\\impatient\\ch03\\exercises", "java");
      for (String name : fileNames) {
         System.out.println(name);
      }
   }

   static List<String> getFilesByExtension(String dirPath, String fileExtension) {
      File dir = new File(dirPath);
      String[] fileNames = dir.list((File unused, String name) -> name.endsWith(fileExtension));
      return Arrays.asList(fileNames);
   }

}