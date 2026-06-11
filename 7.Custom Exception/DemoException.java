/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-11
 */

public class DemoException {
    public static void main(String[] args) {
        
        int i = 7;
        try {

            if(i<10) {
                throw new MyException("Erroorrr..");
            }
         }catch(MyException e) {
            System.out.println(e.getMessage());
         }

    }
}

class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}
