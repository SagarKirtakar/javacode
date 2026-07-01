
public class Example1 {
   
    int no = 10;

    void m1(int no) {
        System.out.println("no 1 : "+no); // refer the local variable of the parameter of method

        System.out.println("no 2 : "+this.no); // refer the current class instance variable
    }

    public static void main(String[] args) {
        Example1 ex = new Example1();
        ex.m1(20);
    }
}
