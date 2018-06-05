/*
 * Print the current working directory
 */
package vol1.chap03.sec07;

import java.io.File;

/**
 *
 * @author emaphis
 */
public class CurrentDirectory {
    public static void main(String[] args) {
        File file = new File(".");   // current directory "."
        String currentDirctory = file.getAbsolutePath();
        System.out.println("Current directory " + currentDirctory);
        
        // OR
        currentDirctory = System.getProperty("user.dir");
        System.out.println("Current directory " + currentDirctory);
    }
}
