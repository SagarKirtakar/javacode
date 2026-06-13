// TotalEarnings class Thread extend karti hai
// matlab yeh class khud ek thread BAN JAATI HAI

/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-13
 */

class TotalEarnings extends Thread {

    int total = 0; // Shared variable — yahi count karenge earnings

    @Override
    public void run() {
        // synchronized(this) matlab:
        // "is TotalEarnings OBJECT ka lock lo"
        // 'this' = t1 object hi hai yahan
        synchronized(this) {
            for (int i = 0; i < 1000; i++) {
                total++; // 1000 baar increment
            }
            // Kaam ho gaya! Ab jo bhi wait kar raha hai
            // use jagao (WAKE UP signal bhejna)
            this.notify();
            // NOTE: notify() ke baad bhi synchronized block
            // khatam hone tak lock hamare paas rehta hai!
        }
        // Yahan synchronized block khatam hua = LOCK RELEASE
    }
}

public class MovieBookApp {

    public static void main(String[] args) throws InterruptedException {

        TotalEarnings t1 = new TotalEarnings(); // Object banao
        t1.start(); // Naya thread shuru karo — run() call hoga alag thread mein

        // Main thread t1 object ka lock lena chahta hai
        synchronized(t1) {

            // t1.wait() — do kaam ek saath karta hai:
            // 1. t1 ka lock RELEASE karta hai (taki t1 thread andar ghus sake)
            // 2. Main thread ko WAITING state mein daal deta hai
            // Matlab: "jab tak notify() na aaye, so ja!"
            t1.wait();

            // Yahan main thread tab aayega jab:
            // 1. t1 thread ne notify() call kiya
            // 2. t1 ka synchronized block khatam hua (lock release hua)
            // 3. main ne wapas lock liya
        }

        // Ab guarantee hai ki t1 ka poora kaam ho chuka hai
        // total = 1000 pakka hai yahan
        System.out.println("Total Earnings : " + t1.total + " Rs");
        // Output: Total Earnings : 1000 Rs
    }
}