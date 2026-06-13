/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-12
 */

class A extends Thread{

    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{

    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
    }
}
