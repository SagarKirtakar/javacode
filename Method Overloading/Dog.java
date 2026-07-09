class Dog extends Animal {
    
    String name = "Vayli";

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("dog is barking");
    }

    void display() {
        System.out.println(super.name);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.makeSound();
      
    }
}