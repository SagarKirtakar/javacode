
public class Example4 {
   
    void m1(Example4 ex4) {
        System.out.println("m1");
    }

    

    void m2() {
        System.out.println("m2 method execution..");
        m1(this); // this is the parameter to the method class 
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Example4 ex = new Example4();
        ex.m1(ex);
        ex.m2();
    }
    
}
