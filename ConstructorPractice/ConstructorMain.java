package Studying.ConstructorPractice;

public class ConstructorMain {
    public static void main(String[] args) {

        Account defualtAccount = new Account();

//        Calling the constructor and passing it the values.
        Account bobsAccount = new Account("12345", 0.00, "Bob brown",
                "myemail@email.com", "905 555-5522");

        Challenge person1 = new Challenge();
        System.out.println(person1.getCustomerNameD());

        Challenge person2 = new Challenge("Bob", "bob@email.com");
        System.out.println(person2.getCustomerNameD());

        Challenge person3 = new Challenge("Tim", "Tim@email.com", 100);
        System.out.println(person3.getCustomerNameD());
    }
}
