package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(Customer c) {
        if(customers.size() == 0){
            customers.add(c);
            System.out.println("Customer named " + name + " is added.");
            return;
        }

        for(Customer current : customers) {
            if(current.getName() == c.getName()){
                System.out.println("Cannot add this customer. Customer with the same name exists.");
                return;
            } else {
                customers.add(c);
                System.out.println("Customer named " + name + " is added.");
            }
        }
    }

    public void addTransactionToLastCustomer(double t) {
        if(customers.size() == 0) {
            System.out.println("Cannot add transaction. No customers yet at branch " + name);
            return;
        } else {
            Customer last = customers.get(customers.size() - 1);
            last.addTransaction(t);
        }

    }
}
