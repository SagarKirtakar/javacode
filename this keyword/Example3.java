
public class Example3 {
    
    Example3() {
       System.out.println("default constructor"); 
    }

    Example3(String name) {
        this(); // using this call current class constructor
        System.out.println("parameterized constructor : "+name);
    }

    public static void main(String[] args) {
        
        Example3 ex = new Example3();
        Example3 ex2 = new Example3("Sagar");
    }
}
