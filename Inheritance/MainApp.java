package Inheritance;

public class MainApp {
    public static void main(String[] args) {

        PetrolEngine petrolEngine = new PetrolEngine();
        ElectricalEngine electricalEngine = new ElectricalEngine();

        Bike bike = new Bike(electricalEngine);
        bike.drives();
        
    }
    
}
