public class Car extends Vehicle  {

    @Override
    void start() {
       System.out.println("Car is started");
    }

    {
        no_of_tyers = 4;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.displayOfTyers();
        c1.start();

    }
    
}
