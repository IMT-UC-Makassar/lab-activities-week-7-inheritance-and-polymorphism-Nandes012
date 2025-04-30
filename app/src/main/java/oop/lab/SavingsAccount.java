package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
        // In real implementation, would transfer to target account
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }
}