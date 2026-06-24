/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hlomp
 */
public class User {
    private String userId;
    private String pin;
    private double balance;
    private List<Transaction> history;

    public User(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public String getUserId() { return userId; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
        history.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        history.add(new Transaction("Withdraw", amount));
        return true;
    }

    public void addTransaction(String type, double amount) {
        history.add(new Transaction(type, amount));
    }

    public List<Transaction> showHistory() {
        
        List<Transaction> tt = new ArrayList<>();
            for (Transaction t : history) {
                tt.add(t);
            }
        return tt;
    }
    
}
