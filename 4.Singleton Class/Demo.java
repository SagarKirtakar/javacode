
class Abc {
   static Abc obj;

   private  Abc() {
    System.out.println("Instance is created...");
   }

   public static Abc getInstace() {
        obj = new Abc();
    
    return obj;
   }
   
}

public class Demo {
    
    public static void main(String[] args) {

        Abc obj1 = Abc.getInstace();
        Abc obj2 = Abc.getInstace();

    }
}
