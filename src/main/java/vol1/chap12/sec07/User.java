/*
 * Chapter 12 User Interface Components
 * Section vol1.chap12.sec07
 */
package vol1.chap12.sec07;

/**
 *
 * @author emaphis
 */
public class User {
   private final String username;
   private final char[] password;

   User(String username, char[] password) {
      this.username = username;
      this.password = password;
   }

   String getName() {
      return username;
   }

   char[] getPassword() {
      return password;
   }
}
