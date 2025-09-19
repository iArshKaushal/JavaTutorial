package org.akk.oop1_basic.c_encapsulation;


class BankAccount {
    private double balance;  // hidden

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}


public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        double balance = account.getBalance();
        System.out.println("Balance: " + balance);
    }
}
