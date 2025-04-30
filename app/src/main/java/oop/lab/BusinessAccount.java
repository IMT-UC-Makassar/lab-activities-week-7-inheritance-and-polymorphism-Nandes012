package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "None";
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.025; // Business accounts get lower interest
        deposit(interest);
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }
}