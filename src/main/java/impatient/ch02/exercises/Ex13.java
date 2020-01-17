/*
 * Exercises - Chaper 2
 * Ex13.java
 */
package impatient.ch02.exercises;

/*
Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
a class with a main method that reads a CSV file of your choice and prints
some of the content. There is sample code on the OpenCSV website. You
haven’t yet learned to deal with exceptions. Just use the following header
for the main method:
public static void main(String[] args) throws Exception
The point of this exercise is not to do anything useful with CSV files, but
to practice using a library that is delivered as a JAR file
*/

// Added OpenCSV using Maven

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.Arrays;


/**
 *
 * @author emaphis
 */
public class Ex13 {

   public static void main(String[] args) throws Exception {
      //System.out.println(System.getProperty("user.dir"));
      CSVReader reader = new CSVReader(new FileReader("resources//stuff.csv"));
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
         System.out.println(Arrays.toString(nextLine));
      }
   }

}
