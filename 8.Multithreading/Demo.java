/**
 * @author: Sagar Kirtakar
 * @date: 2026-06-12
 */

class A{

    void show() {
        for(int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
    }
}

class B {

    void show() {
        for(int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        
        A a1 = new A();
        a1.show();

        B b1 = new B();
        b1.show();
    }
}
