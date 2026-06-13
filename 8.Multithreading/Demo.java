/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-12
 */

// What is Thread
// Multiple Thread
// Thread prority and sleep
// Runnable vs Thread

class A extends Thread{

    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("hi");

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}

class B extends Thread{

    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("hello");

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A a1 = new A();
        B b1 = new B();

        a1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(a1.getPriority());

        System.out.println(b1.getPriority());

        a1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        b1.start();
    }
}
