package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    // Adding members specific to SavingsAccount here
    protected double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        // using 'super' to call the constructor of the superclass 'Account' to
        // initialise the account number and balance.
        super(accountNumber, balance);
        // Initialise the interest rate here
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // the logic for which would be balance = (balance * (1 + 'interestRate'))
        balance = (balance * (1 + interestRate));
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate cannot be negative");
        }
    }

}
