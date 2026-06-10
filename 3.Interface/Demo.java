class Calc{
    
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}

class AdvCalc {

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return a / b;
    }
}

public class Demo {
    
    public static void main(String[] args) {
        
        Calc obj1 = new Calc();
        obj1.add(10, 20);
        obj1.sub(10, 5);

        AdvCalc obj2 = new AdvCalc();
        obj2.mul(10, 4);
        obj2.div(4, 5);

    }
}
