package Studying.ConstructorPractice;

public class Challenge {

    private String customerNameD;
    private String customerEmailD;
    private double accountBalanceD;

//    Constructor with default fields. To use the constructor with default
//    fields, you must also have the other constructor created or you'll
//    receive a compilation error.
    public Challenge() {
        this ("customerName","email@email.com",0.00);
        System.out.println("Account with default values");
    }

//    Constructor with one default field and asking for the other two.
    public Challenge(String customerNameD, String customerEmailD) {
        this (customerNameD, customerEmailD, 0.00);

    }

    //    Constructor with no default fields.
    public Challenge(String customerNameD, String customerEmailD, double accountBalanceD) {
        this.customerNameD = customerNameD;
        this.customerEmailD = customerEmailD;
        this.accountBalanceD = accountBalanceD;
    }
    public String getCustomerNameD() {
        return customerNameD;
    }

    public String getCustomerEmailD() {
        return customerEmailD;
    }

    public double getAccountBalanceD() {
        return accountBalanceD;
    }
}

/*  1. Create a constructor that has default fields.
    2. Pass two values to the constructor and leave the third one as default.
    3. Create getters only for this using intellij code generation.
* */
