public class Test extends Vehicle {

    

    public Test(String name) {
        super(name);
        System.out.println("Testing");
    }


    @Override
    void start() {
        System.out.println("vehicle is running..");
    }

    public static void main(String[] args) {
        Test t1 = new Test("BMW");
        t1.start();
    }
    
}
