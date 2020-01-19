/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercise 13
 */
package impatient.ch03.exercises;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/*
Given an array of File objects, sort it so that directories come before files,
and within each group, elements are sorted by path name. Use a lambda
expression to specify the Comparator
*/

/**
 * @author emaphis
 */
public class Ex13 {

   public static void main(String[] args) {
      List<File> files = getFiles("C:\\");
      sortFileList(files);
      files.forEach((file) -> {
         System.out.println(file.getName());
      });
   }

   static void sortFileList(List<File> files) {
      files.sort((file1, file2) -> {
         if (file1.isDirectory() && !file2.isDirectory()) {
            return -1;
         }
         else if (!file1.isDirectory() && file2.isDirectory()) {
            return 1;
         }
         else {
            return file1.compareTo(file2);
         }
      });
   }

   static List<File> getFiles(String path) {
      File dir = new File(path);
      File[] fileArray = dir.listFiles();
      return Arrays.asList(fileArray);
   }
}
