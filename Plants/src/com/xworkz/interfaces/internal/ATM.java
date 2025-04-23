package com.xworkz.interfaces.internal;

public interface ATM {
    void insertCard();
    void enterPin();
    void checkBalance();
    void withdrawCash();
    void depositCash();
    void transferMoney();
    void requestStatement();
    void changePin();
    void exit();
}