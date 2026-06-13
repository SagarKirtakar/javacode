/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-12
 */

// What is Thread
// Multiple Thread
// Thread prority and sleep
// Runnable vs Thread
// Thread States 
// Synchronize Keyword
// Multithreading Inter-thread Communication


// class A extends Thread{

//     public void run() {
//         for(int i = 0; i <= 100; i++) {
//             System.out.println("hi");

//         try {
//             Thread.sleep(2);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         }
//     }
// }

// class B extends Thread{

//     public void run() {
//         for(int i = 0; i <= 5; i++) {
//             System.out.println("hello");

//         try {
//             Thread.sleep(2);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         }
//     }
// }

public class Demo {
    public static void main(String[] args) {
        
        Runnable r1 = () -> 
        {
            for(int i = 0; i <= 5; i++) {
                System.out.println("hi");

                try {
                Thread.sleep(2);
                } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> 
        {
            for(int i = 0; i <= 5; i++) {
                System.out.println("hello");

                try {
                Thread.sleep(2);
                } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                }
            }
        };
            
        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(r2);

        t1.start();

        t2.start();

    }
}
