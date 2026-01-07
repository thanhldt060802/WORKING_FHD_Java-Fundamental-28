package app;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String pin;
    private double balance;

    public Account(String id, String pin, double balance) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toFileString() {
        return String.format("%s, %s, %f", this.id, this.pin, this.balance);
    }

    @Override
    public String toString() {
        return String.format("Account [id=%s, pin=%s, balance=%f]", this.id, this.pin, this.balance);
    }
    
}
