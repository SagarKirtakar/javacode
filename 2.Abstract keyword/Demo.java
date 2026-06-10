            /*  Abstract Keyword  */

// we can't create the object of abstract class
// There is no compultion of abstract class can have only abstract methods only either it can normal methods or all methods are normal             
// if a class contain any one abstract methods so that we have to make abstract class 
// we can create reference of abstract class

 abstract class Car{     

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }

}

class WagonR extends Car {

    @Override
    public void drive() {
        System.out.println("Driving");

    }

    public void brand() {
        System.out.println("name is WagonR");
    }

}

public class Demo {
 
    public static void main(String[] args) {
        
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();

        WagonR obj1 = new WagonR();
        obj1.brand();
    }
   
}
