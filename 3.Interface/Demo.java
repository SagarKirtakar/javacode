
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

interface Computer {
     void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run...");
    }
}

class Desktop implements Computer{
    
    public void code() {
        System.out.println("code, compile, run..Faster");
    }
}

class Developer {

    public void code(Computer pc) {
        System.out.println("code, compile, run...");
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

        Laptop lap = new Laptop();

        Desktop desk = new Desktop();

        Developer java = new Developer();
        java.code(desk);

        Developer c = new Developer();
        c.code(lap);

    }
}
