package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;

    // Initialise and assign the a constructor for 'CurrentAccount'
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        // Calling the constuctor for 'accountNumber' and 'balance' from the 'Account'
        // class using "super"
        super(accountNumber, balance);
        // Initialise the constructor for 'overdraftLimit' here because it' unique to
        // 'CurrentAccount' here
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double requested) {
        if (requested <= balance) {
            // sufficient balance to cover the withdrawal
            return super.withdraw(requested); // call the base class method
        } else {
            // insuficient funds, check overdraft limit
            if (requested <= (balance + overdraftLimit)) {
                // Withdrawal within the overdraft limit
                double overdraftUsed = requested - balance;
                overdraftLimit -= overdraftUsed; // Reset overdraft limit
                return super.withdraw(balance); // Withdraw the remaining balance
            } else {
                // Withdrawal exceeds overdraft limit
                System.out.println("Withdrawal exceeds overdraft limit");
                return 0; // Withdrawal rejected
            }
        }
    }

}
