/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

class Counter {
    
    int count;

    void increament() {
        count++;
    }
}


public class Demo {
    
    public static void main(String[] args) {
       


        Counter obj1 = new Counter();
        obj1.increament();

        System.out.println("Count is "+ obj1.count);

    }
}
