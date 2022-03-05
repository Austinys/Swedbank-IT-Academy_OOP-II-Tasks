package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {
    private final double interest;
    private final double credit;

    public CreditCard(double interest, double credit) {
        this.interest = interest;
        this.credit = credit;
    }


    @Override
    void credit(double amount, double balance, string cardHolderName, string cardNumber) {

    }

    @Override
    void debit(double amount, double balance, string cardHolderName, string cardNumber) {

    }
}
