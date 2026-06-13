import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// BufferedReader
// Read line by line file by using readLine() method

public class FileExample2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sagar\\Desktop\\Codes\\8.4 BufferedWriter\\example.txt"));

        String s1;

        while((s1 = br.readLine()) != null) {
            System.out.println(s1);
        }
        
        br.close();

    }
}
