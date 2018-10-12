/*
 * Chapter 9 Collections
 * Section vol1.chap09.collection
 */
package vol1.chap09.collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author emaphis
 */
public class TestTask {
   static void testTask() {
      PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
      PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");
      CodingTask databaseCode = new CodingTask("db");
      CodingTask intefaceCode = new CodingTask("gui");
      CodingTask logicCode = new CodingTask("locic");

      Collection<PhoneTask> phoneTasks = new ArrayList<>();
      Collection<CodingTask> codingTasks = new ArrayList<>();
      Collection<Task> mondayTask = new ArrayList<>();
      Collection<Task> tuesdayTask = new ArrayList<>();

      // adding elements using Collection interface.
      Collections.addAll(phoneTasks, mikePhone, paulPhone);
      Collections.addAll(codingTasks, databaseCode, intefaceCode, logicCode);
      Collections.addAll(mondayTask, logicCode, mikePhone);
      Collections.addAll(tuesdayTask, databaseCode, intefaceCode, paulPhone);

      System.out.println("phone:   " + phoneTasks.toString());
      System.out.println("coding:  " + codingTasks.toString());
      System.out.println("monday:  " + mondayTask.toString());
      System.out.println("tuesday: " + tuesdayTask.toString());

      mondayTask.add(new PhoneTask("Ruth", "567 1234"));
      System.out.println("monday: " + mondayTask.toString());

      // Compine schedules
      Collection<Task> allTasks = new ArrayList<>();
      allTasks.addAll(mondayTask);
      allTasks.addAll(tuesdayTask);
      System.out.println("all: " + allTasks.toString());

      // Removing elements
      if (mondayTask.remove(mikePhone)) {
         System.out.println("monday now: " + mondayTask.toString());
      } else {
         System.out.println("Failed to remove Mike's phone call");
      }

      // clear tasks
      mondayTask.clear();
      if (mondayTask.isEmpty()) System.out.println("Monday is empty");
      else System.out.println("Failed to remove tasks");

      // find other than phone tasks
      Collection<Task> tuesdayNoPhoneTasks = new ArrayList<>(tuesdayTask);
      tuesdayNoPhoneTasks.removeAll(phoneTasks);
      System.out.println("no phone: " + tuesdayNoPhoneTasks);

   }

   public static void main(String[] args) {
      testTask();
   }
}
