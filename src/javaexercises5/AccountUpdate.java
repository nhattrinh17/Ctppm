package javaexercises5;

public class AccountUpdate {
    private int id;
    private CustomerBank customerBank;
    private double balance;

    public AccountUpdate(int id, CustomerBank customerBank) {
        this.id = id;
        this.customerBank = customerBank;
        this.balance = 0.00;
    }

    public AccountUpdate(int id, CustomerBank customerBank, double balance) {
        this.id = id;
        this.customerBank = customerBank;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public CustomerBank getCustomerBank() {
        return this.customerBank;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return this.customerBank.toString() + " balance=$" + this.balance;
    }

    public String getCustomerBankName() {
        return this.customerBank.getName();
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        }
        return this.balance;
    }
}
