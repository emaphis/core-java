/*
 * Chapter 6 - Interfaces
 * Exercise 11
 */
package vol1.chap06.exercises;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

/**
 * Test the FileFilter interface.
 * @author emaphis
 */
public class TestListDirs {

   /**
    *  Use an FileFilter Object
    * @param dirPath path to directory to examine
    * @return list of directories
    */
   public static List<File> getsubdirectories1(String dirPath) {
      FileFilter filter = new FileFilter() {
         @Override
         public boolean accept (File dirPath) {
            return dirPath.isDirectory();
         }
      };

      ArrayList<File> fileList = new ArrayList<>();
      File dir = new File(dirPath);
      File[] files = dir.listFiles(filter);
      fileList.addAll(Arrays.asList(files));

      return fileList;
   }

   
   /**
    * Use an inline FileFilter Object
    * @param dirPath path to directory to examine
    * @return list of directories
    */
   public static List<File> getsubdirectories2(String dirPath) {
      ArrayList<File> fileList = new ArrayList<>();
      File dir = new File(dirPath);
      File[] files = dir.listFiles( new FileFilter() {
         @Override
         public boolean accept (File dirPath) {
            return dirPath.isDirectory();
         }
      });
      fileList.addAll(Arrays.asList(files));

      return fileList;
   }

   /**
    * Use an inline FileFilter lambda
    * @param dirPath path to directory to examine
    * @return list of directories
    */
   public static List<File> getsubdirectories3(String dirPath) {
      ArrayList<File> fileList = new ArrayList<>();
      File dir = new File(dirPath);
      File[] files = dir.listFiles(dirPath1 -> dirPath1.isDirectory());
      fileList.addAll(Arrays.asList(files));

      return fileList;
   }

   /**
    * Use an inline FileFilter Reference
    * @param dirPath path to directory to examine
    * @return list of directories
    */
   public static List<File> getsubdirectories4(String dirPath) {
      ArrayList<File> fileList = new ArrayList<>();
      File dir = new File(dirPath);
      File[] files = dir.listFiles(File::isDirectory);
      fileList.addAll(Arrays.asList(files));

      return fileList;
   }

   static void printDirs(List<File> fileList) {
      for (File file : fileList) {
         System.out.println("dir: " + file.getPath());
      }
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter path to examine: ");
      String path = scan.nextLine();
      //List<File> fileList = getsubdirectories1(path);
      //List<File> fileList = getsubdirectories2(path);
      //List<File> fileList = getsubdirectories3(path);
      List<File> fileList = getsubdirectories4(path);
      printDirs(fileList);
   }
}
