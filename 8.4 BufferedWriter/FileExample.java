import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// Writing to a file using BufferedWriter


public class FileExample {

    public static void main(String[] args) throws IOException {
       
        BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt",true));

        bw.write(" TATA");

        bw.close();
    }
}