package com.cbfacademy.accounts;

public class Account {
    // Creating the variable/class properties (so they're available to every method
    // in this class)
    // Private because these variables should ONLY be accessible and mutable by
    // getter and setter methods specified in this class. Making them public allows
    // for other classes to call and mutate the variables at will
    protected int accountNumber;
    protected double balance;

    // This is a constructor that accepts parameters representing the new account
    // number and starting balance
    public Account(int accountNumber, double balance) {
        // Instantiating the variables inside the constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double requested) {
        if (requested > balance || 0 > requested) {
            return 0;
        } else {
            balance -= requested;
            return requested;
        }
    }

    @Override
    public String toString() {
        return "Account no: " + accountNumber + " Balance: £" + String.format("%.2f", balance);
    }
}
