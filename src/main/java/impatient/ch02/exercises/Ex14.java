/*
 * Exercises - Chaper 2
 * Ex14.java
 */
package impatient.ch02.exercises;

/*
> javac Network.java
> javap Network.class
Compiled from "Network.java"
public class impatient.ch02.sec06.Network {
  public impatient.ch02.sec06.Network();
  public impatient.ch02.sec06.Network$Member enroll(java.lang.String);
  public void unenroll(impatient.ch02.sec06.Network$Member);
  public java.lang.String toString();
}

>javap -private Network$Member.java

Compiled from "Network.java"
public class impatient.ch02.sec06.Network$Member {
  private java.lang.String name;
  private java.util.ArrayList<impatient.ch02.sec06.Network$Member> friends;
  final impatient.ch02.sec06.Network this$0;
  public impatient.ch02.sec06.Network$Member(impatient.ch02.sec06.Network, java.lang.String);
  public void deactivate();
  public void addFrient(impatient.ch02.sec06.Network$Member);
  public boolean belongsTo(impatient.ch02.sec06.Network);
  public java.lang.String toString();
}
*/


/**
 * @author emaphis
 */
public class Ex14 {
}
