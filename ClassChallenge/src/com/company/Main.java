package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        account.deposit(-10);
        account.deposit(10);
        account.withdraw(-5);
        account.withdraw(5);
        account.withdraw(1200);

        BankAccount account2  = new BankAccount(12345, 1000, "", "",123 );

        VipCustomer c1 = new VipCustomer();
        VipCustomer c2 = new VipCustomer("Efe UZEL", 1_000_000);
        VipCustomer c3 = new VipCustomer("Elon MUSK", 1_000_000_000, "elon@tesla.com");

        System.out.println("c1 = " + c1.getName() + " "+ c1.getEmailAddress());
        System.out.println("c2 = " + c2.getName() + " "+ c2.getEmailAddress());
        System.out.println("c3 = " + c3.getName() + " "+ c3.getEmailAddress());



    }
}
