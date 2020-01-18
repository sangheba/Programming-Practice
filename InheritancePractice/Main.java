package Studying.InheritancePractice;

public class Main {
    public static void main(String[] args) {

//        Create an object of the Animal class.
        Animal animal = new Animal("Animal", 1,1,5,5);

//        Create an object of the Dog class.
        Dog dog = new Dog("Yorkie",1,1,2,4,2,4,1, 20, "Long Silky Coat");
        dog.eat();
//        dog.walk();
        dog.run();

    }
}
