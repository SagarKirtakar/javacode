
class Human {
    
   private int age;
   private String name;

   public int getAge() {
    return age;
   }

   public void setAge(int age) {
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
