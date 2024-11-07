package Bank;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
private String accountNumber;
private double balance;
private List<Transaction> transactionHistory = new ArrayList<>();

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
            Date date = new Date();
            Transaction Deposit = new Transaction(date,"deposit" ,amount);
            transactionHistory.add(Deposit);
        }
    }
    public void withdrawal(double amount){
        if (amount <= balance){
            balance -= amount;
            Date date = new Date();
            Transaction Withdrawal = new Transaction(date, "withdrawal",amount);
            transactionHistory.add(Withdrawal);
        }
    }
    public void displayTransactionHistory(){
        System.out.println("Transaction history:");
    }

}
