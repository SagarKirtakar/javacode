package Inheritance;

public class Bike {

    private Engine engine;

    Bike(Engine engine) {
        this.engine = engine;
    }

    void drives() {
        engine.start();
        System.out.println("Bike is safely moving...");
    }
}
    

