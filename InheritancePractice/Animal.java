package Studying.InheritancePractice;

public class Animal {

//    Class attributes.
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

//    Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

//    A method for the animal class. This will also be inherited by other
//    classes that extend from this one.
    public void eat () {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. \nAnimal is moving at " + speed);
    }

//    Getter methods
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
