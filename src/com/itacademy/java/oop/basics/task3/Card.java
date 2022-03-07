package com.itacademy.java.oop.basics.task3;

public abstract class Card {
   abstract void credit(double amount, double balance, String cardHolderName, String cardNumber);
   abstract void debit(double amount, double balance, String cardHolderName, String cardNumber);
}


