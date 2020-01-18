package Studying.ConstructorPractice;

public class Account {

    //    Creating the class attributes.
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

//        You can call an empty constructor, using a special case of the "this"
//        keyword to create an object with default parameters.
    public Account() {
//        The line containing this must be the first line in the block,
//        excluding comments.
        this("12345", 2.50, "Default name",
                "Default Email", "Default Phone");
        System.out.println("Account with defaults created.");
    }

    //    Creating the constructor for the object/class.
    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

}