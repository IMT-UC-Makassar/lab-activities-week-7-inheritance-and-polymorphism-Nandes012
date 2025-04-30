package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        // Checking accounts typically don't earn interest
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