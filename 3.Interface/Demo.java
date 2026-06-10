
interface A {
    
    int age= 44;
    String name= "sagar";

    abstract void show();
    abstract void config();
}

class B implements A {

    @Override
    public void show() {
      System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

}

public class Demo {
    
    public static void main(String[] args) {
        
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.name);

    }
}
