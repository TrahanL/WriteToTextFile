package writetotextfile;

/**
 *
 * @author Lucas
 */

import java.time.LocalDateTime;

public class WriteToTextFile {

    public static void main(String[] args) throws Exception{
        
        java.io.File file = new java.io.File("mytext.txt");
        if (file.exists()) {
            System.out.println("This File Already Exists");
            System.exit(0);
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        LocalDateTime current = LocalDateTime.now();
        
        output.printf("Lucas Trahan\n"+current);
        
        output.close();
        }
    }
