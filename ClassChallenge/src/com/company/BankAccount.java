package com.company;

import java.lang.reflect.AccessibleObject;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public BankAccount(){
        //this() has to be in the first line of the constructor
        this(123456, 1000.0, "", "", 12345);
        System.out.println("Initialized BankAccount with no parameters");
    }

    //this can be called the major construcor as it initializes all fields.
    public BankAccount(int accountNumber, double balance, String customerName, String emailAddress, int phoneNumber) {
        //we can use ste methods here to take advantage of validations however there are opposing opinions
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    //we can default some fields like below
    public BankAccount(String customerName, String emailAddress, int phoneNumber) {
        this(999999, 0, customerName, emailAddress, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited " +
                    String.format("%.2f", amount) +
                    ", new balance is " +
                    String.format("%.2f", balance ));
        } else {
            System.out.println("Cannot deposit negative or zero amount.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            if(balance - amount >0){
                balance -= amount;
                System.out.println("Withdrawn " +
                        String.format("%.2f", amount) +
                        ", new balance is " +
                        String.format("%.2f", balance ));
            } else {
                System.out.println("Insufficient funds");
            }

        } else {
            System.out.println("Cannot withdraw negative or zero amount.");
        }
    }

}
