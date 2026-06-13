import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// Reading data from file
// FileInputStream

public class FileInputExample3 {
    public static void main(String[] args) {
        
        try {
            File file = new File("myfile.txt");

            FileInputStream fis = new FileInputStream(file);

            int i;

            do{
                i = fis.read();
               if(i != -1) {
                    System.out.print((char) i);
               }
            }while(i != -1);
        }catch(IOException io) {
            System.out.println("An error occurred "+io.getMessage());
        }
    }
}
