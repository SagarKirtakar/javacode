import java.io.IOException;
import java.sql.SQLException;

public class DemoException {
    
  public static void main(String[] args) throws IOException, SQLException {
    
    int i,j,k=0;

    i=8;
    j=2;
    int a[]  = new int[4];
    try 
    {
        k = i/j;
        if(k<10) {
            throw new ArithmeticException();
        }

        for(int c=0; c<=4; c++) {
            a[c] = c+1;
        }

        for(int value : a) {
            System.out.println(value);
        }
    
    }catch(ArithmeticException e) {
        System.out.println("Minimum value for the output is 10");
    }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Maximum number of array size is 4");
    }catch(Exception e){
        System.out.println("Some error..");
    }finally {
        System.out.println(k);
        System.out.println("BYE..");
    }


  }
}
