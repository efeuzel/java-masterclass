package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");
        bank.addBranch(new Branch("My First Branch"));
        bank.addTransactionToLastCustomerOfLastBranch(10);
        bank.addCustomerToLastBranch(new Customer("Efe"));
        bank.addTransactionToLastCustomerOfLastBranch(10);

    }

}
