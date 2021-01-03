package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(Branch b) {
        if (branches.size() == 0) {
            branches.add(b);
            System.out.println("New branch named " + b.getName() + " is added to " + name +".");
            return;
        }

        for (Branch current : branches) {
            if (current.getName().equals(b.getName())) {
                System.out.println("Branch with the same name exists. Not added.");
                return;
            } else {
                branches.add(b);
                System.out.println("New branch named " + name + " is added.");
            }
        }
    }

    public void addCustomerToLastBranch(Customer c) {
        if (branches.size() == 0) {
            System.out.println("No branches yet");
            return;
        }
        Branch last = branches.get(branches.size() - 1);
        last.addNewCustomer(c);
    }

    public void addTransactionToLastCustomerOfLastBranch(double t) {
        if (branches.size() == 0) {
            System.out.println("No branches yet");
            return;
        } else {
            Branch last = branches.get(branches.size() - 1);
            last.addTransactionToLastCustomer(t);
        }
    }


}
