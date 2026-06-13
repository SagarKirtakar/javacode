/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

// Multithreading Inter-thread Communication

public class Demo {
    
    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("Before Sleeping..");

        Thread.sleep(5000);

        System.out.println("Woke Up...");
    }
}
