
public class Example2 {
    
    void showMsg() {
        System.out.println("show msg");
    }

    void diplayMsg() {
        this.showMsg();
        System.out.println("display msg");
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.showMsg();
        ex.diplayMsg();
    }
}
