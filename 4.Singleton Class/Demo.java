
class Abc {
   static Abc obj = new Abc();

   private  Abc() {
    System.out.println("This is private contructor of singleton class..");
   }

   public static Abc getInstace() {
    return obj;
   }
   
}

public class Demo {
    
    public static void main(String[] args) {

        Abc obj1 = Abc.getInstace();
        System.out.println("This is second instance");
        Abc obj2 = Abc.getInstace();

    }
}
