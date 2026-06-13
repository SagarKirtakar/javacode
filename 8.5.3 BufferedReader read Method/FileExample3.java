import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// BufferedReader
// run method(array, off Start index of array, sizeOf chars)

public class FileExample3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sagar\\Desktop\\Codes\\8.4 BufferedWriter\\example.txt"));

        char [] arr = new char[20];

        br.read(arr, 5, 5);

        System.out.println(arr);

        br.close();

    }
}

