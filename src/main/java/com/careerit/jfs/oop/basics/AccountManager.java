package com.careerit.jfs.oop.basics;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1 = new Account("Krish" ,10000);
        acc1.showAccountInfo();
        System.out.println("-".repeat(60));
        Account acc2 = new Account("Manoj" ,20000);
        acc2.showAccountInfo();

        acc1.withdraw(5000);
        acc1.showBalance();
        acc1.deposit(1000);
        acc1.showAccountInfo();
        acc2.showAccountInfo();
    }
}
