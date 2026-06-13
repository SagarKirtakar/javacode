import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */



public class FileExample {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sagar\\Desktop\\Codes\\8.4 BufferedWriter\\example.txt"));

        int ch;

        while((ch = br.read()) != -1) {
            System.out.print((char) ch);
        }
        
        br.close();

    }
}
