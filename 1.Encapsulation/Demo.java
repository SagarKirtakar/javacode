
class Human {
    
   private int age; // data members is private because it can't access outside of the class 
   private String name;

   public int getAge() { // your method name is says whats your intention is here
    return age;
   }

   public void setAge(int age) { // private data we can access outside of the class by using member function so that's why it is public
    this.age = age;
   }

   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }

   
}

public class Demo {

    public static void main(String[] a) {
        
        Human h = new Human();
        h.setAge(24);
        int age = h.getAge();

        h.setName("kirtakar");
        String name = h.getName();

        System.out.println(name + " : "+age);
        

    }
    
}
