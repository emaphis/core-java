/*
 * Chapter 6 - Interfaces
 * Exercise 12
 */
package vol1.chap06.exercises;

import java.io.File;
import java.util.*;

/**
 * Test the FileFilter interface.
 * @author emaphis
 */
public class TestListFiles {

   /**
    * Return files of a given extension
    * @param dirPath directory searched
    * @param extension to search for
    * @return list of files
    */
   public static List<String> getFilesOfExtension(String dirPath, String extension) {
      ArrayList<String> fileList = new ArrayList<>();
      File dir = new File(dirPath);
      // capture the extension parameter
      String[] files = dir.list((dir1, fileName) -> fileName.endsWith(extension));
      fileList.addAll(Arrays.asList(files));

      return fileList;
   }
   
   static void printDirs(List<String> fileList) {
      for (String file : fileList) {
         System.out.println("file: " + file);
      }
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter path to examine: ");
      String path = scan.nextLine();
      System.out.println("Enter file extension");
      String ext = scan.nextLine();
      List<String> fileList = getFilesOfExtension(path, ext);
      printDirs(fileList);
   }
}
