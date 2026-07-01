
public class A {
   
    int no = 100;

    A() {
        System.out.println("A constructor");
        B ref = new B(this); //  this as the instance of the current class pass as the parameter to the constructor
    }

    public static void main(String[] args) {
        A ref = new A();
    }
}

class B {

    B(A ref) {
        System.out.println("B constructor");
        System.out.println("A class value : "+ref.no);
    }
}
