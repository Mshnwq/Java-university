package lab8;
import java.util.Random;

public class Account {
    private double balance;
    private String name;
    private int acctNum;
    Random rand = new Random();
    int boundry = 9;

    public Account(double initBal, String owner, int number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = rand.nextInt(boundry) + 1;
    }
    public Account(String owner) {
        balance = 0;
        name = owner;
        acctNum = rand.nextInt(boundry) + 1;
    }
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    public void withdraw(double amount, double fee) {
        if (balance >= (amount + fee))
            balance -= (amount + fee);
        else
            System.out.println("Insufficient funds");
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public String toString() {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}