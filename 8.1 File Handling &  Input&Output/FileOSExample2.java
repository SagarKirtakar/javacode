import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// FileOutputStream using write data in file

public class FileOSExample2 {
    
    public static void main(String[] args) throws IOException {
        
        File f1 = new File("myfile.txt");

        FileOutputStream fout;
        fout = new FileOutputStream(f1, true);

        String s = "TATA";

        char [] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            fout.write(arr[i]);
        }
        fout.close();
    }
}
