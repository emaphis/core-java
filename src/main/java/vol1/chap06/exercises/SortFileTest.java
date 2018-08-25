/*
 * Chapter 6 - Intefaces
 * Excercist 13
 */
package vol1.chap06.exercises;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Test the sort file function
 * @author emaphis
 */
public class SortFileTest {
   /**
    * Sort a list of files
    * @param files List of files to compare 
    */
   public static void sortFiles(File[] files) {
      Arrays.sort(files, (File f1, File f2) -> {
         if (f1.isDirectory() && !f2.isDirectory()) {
            return -1;
         } else if (!f1.isDirectory() && f2.isDirectory()) {
            return 1;
         } else {
            return f1.compareTo(f2);
         }
      });
   }

   /**
    * Get files in a directory
    * @param dirPath path to directory to examine
    * @return list of files
    */
   public static File[] getFiles(String dirPath) {
      File dir = new File(dirPath);
      File[] files = dir.listFiles();

      return files;
   }

   public static void printFiles(File[] files) {
      for (File file : files) {
         System.out.println("file: " + file.toString());
      }
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter path to examine: ");
      String path = scan.nextLine();
      File[] files = getFiles(path);
      System.out.println("Files: ");
      printFiles(files);
      sortFiles(files);
      System.out.println("Sorted files: ");
      printFiles(files);
   }
}
