/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

/*
Using the 'listFiles(FileFilter)' and 'isDirectory' methods of the java.io.File
class, write a method that returns all subdirectories of a given directory.
Use a lambda expression instead of a FileFilter object. Repeat with a
method expression and an anonymous inner class
*/

/**
 * @author emaphis
 */
public class Ex11 {

   public static void main(String[] args) {
      //printFiles(getSubDirectories1("C:\\"));
      printFiles(getSubDirectories2("C:\\"));
      //printFiles(getSubDirectories3("C:\\"));
   }

   // anonymous inner class
   static List<File> getSubDirectories1(String path) {
      File dir = new File(path);
      File[] dirs = dir.listFiles(new FileFilter() {
         @Override
         public boolean accept(File pathname) {
            return pathname.isDirectory();
         }
      });
     return Arrays.asList(dirs);
   }

   // lambda expression
   static List<File> getSubDirectories2(String path) {
      File dir = new File(path);
      File[] dirs = dir.listFiles((File pathname) -> pathname.isDirectory());
      return Arrays.asList(dirs);
   }

   // member reference
   static List<File> getSubDirectories3(String path) {
      File dir = new File(path);
      File[] dirs = dir.listFiles(File::isDirectory);
      return Arrays.asList(dirs);
   }

   static void printFiles(List<File> files) {
      files.forEach((file) -> {
         System.out.println(file.toString());
      });
   }
}
