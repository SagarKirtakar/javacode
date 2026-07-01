public class ThisDemo {

    int no;

    ThisDemo setValue(int no) {
        this.no = no;
        return this; // pass as the current class reference
    }

    void display() {
        System.out.println("display call");
    }

    public static void main(String[] args) {
        ThisDemo ref = new ThisDemo();
         ref.setValue(100).display();
    }
}