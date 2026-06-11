
class Abc {
   static Abc obj;

   private  Abc() {
    System.out.println("Instance is created...");
   }

   public static Abc getInstace() {

    if(obj == null ) obj = new Abc();    
    return obj;
   }
   
}

public class Demo {
    
    public static void main(String[] args) {

        Abc obj1 = Abc.getInstace();
        Abc obj2 = Abc.getInstace();

        System.out.println(obj1 == obj2);

    }
}
