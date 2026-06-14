import java.util.Scanner;

interface ATMState{
    void insertCard(ATM atm);
    void enterPin(ATM atm,Scanner sc);
    void deposit(ATM atm,double amt);
    void withdraw(ATM atm,double amt);
    void checkBalance(ATM atm);
    void removeCard(ATM atm);
}