/*
 * Reading a password.
 */
package vol1.chap03.sec07;

import java.io.Console;

/**
 * Read a password
 * @author emaphis
 */
public class PassWord {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword();
        System.out.println("User name: " + username + " Password: " + passwd);
    }
}
