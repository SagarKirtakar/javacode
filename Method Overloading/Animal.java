public class Animal {

    String name = "Generic animal";

    void makeSound() {
        System.out.println("all animal make sound");
    }
    
}

class Dog extends Animal {
    
    String name = "Vayli";

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("dog is barking");
    }
}