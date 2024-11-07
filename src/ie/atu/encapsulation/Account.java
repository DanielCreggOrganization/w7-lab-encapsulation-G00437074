package ie.atu.encapsulation;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    // Private fields
    private double balance;
    private ArrayList<String> transactionHistory;
    private int dailyTransactionCount;
    private static final int MAX_DAILY_TRANSACTIONS = 3;
    private static final double INTEREST_RATE = 0.02; // 2% annual interest rate

    // Constructor
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        this.dailyTransactionCount = 0;
        addTransaction("Account opened with balance: $" + initialBalance);
    }

    // Deposit method
    public void deposit(double amount) {
        checkDailyTransactionLimit();
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        dailyTransactionCount++;
        addTransaction("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    // Withdrawal method
    public void withdraw(double amount) {
        checkDailyTransactionLimit();
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        dailyTransactionCount++;
        addTransaction("Withdrew: $" + amount + ", New Balance: $" + balance);
    }

    // Calculate interest based on balance (simple interest, annually)
    public double calculateAnnualInterest() {
        return balance * INTEREST_RATE;
    }

    // Generate account statement
    public String generateStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append("Account Statement\n");
        statement.append("Date: ").append(new Date()).append("\n");
        statement.append("Balance: $").append(balance).append("\n");
        statement.append("Transaction History:\n");
        for (String transaction : transactionHistory) {
            statement.append(transaction).append("\n");
        }
        return statement.toString();
    }

    // Private helper method to add transactions to history
    private void addTransaction(String transaction) {
        transactionHistory.add(new Date() + " - " + transaction);
    }

    // Private helper to check daily transaction limit
    private void checkDailyTransactionLimit() {
        if (dailyTransactionCount >= MAX_DAILY_TRANSACTIONS) {
            throw new IllegalStateException("Daily transaction limit reached.");
        }
    }

    // Reset daily transaction count (to be called externally, e.g., at the start of each day)
    public void resetDailyTransactionCount() {
        dailyTransactionCount = 0;
    }

    // Getters for balance and daily transaction count
    public double getBalance() {
        return balance;
    }

    public int getDailyTransactionCount() {
        return dailyTransactionCount;
    }
}