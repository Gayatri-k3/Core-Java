package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.ATM;

public class HDFCATM implements ATM {
    public void insertCard() { System.out.println("Card inserted"); }
    public void enterPin() { System.out.println("PIN entered"); }
    public void checkBalance() { System.out.println("Checking balance"); }
    public void withdrawCash() { System.out.println("Withdrawing cash"); }
    public void depositCash() { System.out.println("Depositing cash"); }
    public void transferMoney() { System.out.println("Transferring money"); }
    public void requestStatement() { System.out.println("Requesting statement"); }
    public void changePin() { System.out.println("Changing PIN"); }
    public void exit() { System.out.println("Exiting"); }
}