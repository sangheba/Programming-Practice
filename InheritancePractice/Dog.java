package Studying.InheritancePractice;

//This class inherits the animal class. This is done using the "extends keyword
//followed by the class from which it's inheriting.
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    Constructor. The first line is the constructor for the "Animal" class.
//    Added to it are the dog specific attributes.
//    The second line, using the "super" keyword allows us to add extra
//    attributes or "behaviors" specific to the Dog class. You can populate
//    these fields with their values.
    public Dog(String name, int brain, int body, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
//       Initialize the new, Dog specific attributes.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

//    This is an over written method. This method will also be called when
//    the one it over writes is called.
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

//    Calling the "move" method from the animal class. Use the "super"
//    keyword to call the method from the extended class regardless of if
//    there is a move method in this class.
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }
//
    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }
}
