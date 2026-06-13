import java.io.File;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// File Handling
// File Class


public class FileExample1 {
    
    public static void main(String[] args) {
        
        try 
        {
            File f1 = new File("example.txt");

            if(f1.exists()) {
                System.out.println("File exist at "+ f1.getAbsolutePath());
            }

            if(f1.createNewFile()) {
                System.out.println("file successfully created.");
            }else {
                System.out.println("File already exists.");
            }
           
            if(f1.delete()) {
                System.out.println("file deleted successfully");
            }else {
                System.out.println("failed to delete..");
            }
        }catch(IOException io) {
            System.out.println("An erroe occured.."+io.getMessage());
        }
    }
}
