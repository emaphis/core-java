/*
 * Chapter 9 Collections
 * Section Set
 */
package vol1.chap09.set;

import vol1.chap09.collection.*;
import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestSet {
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


      // New: Code
      Set<Task> phoneAndModayTasks = new TreeSet<>(mondayTask);
      phoneAndModayTasks.addAll(phoneTasks);
      System.out.println(phoneAndModayTasks.toString());
   }

   public static void main(String[] args) {
      testTask();
   }
}
