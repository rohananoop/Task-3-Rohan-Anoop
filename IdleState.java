import java.util.Scanner;

class IdleState implements ATMState{
    public void insertCard(ATM atm){
        System.out.println("Card insertion successful");
        atm.setState(new HasState());
    }
    public void enterPin(ATM atm,Scanner sc){
        System.out.println("Insert card first");
    }
    public void deposit(ATM atm,double amt){
        System.out.println("Insert card first");
    }
    public void withdraw(ATM atm,double amt){
        System.out.println("Insert card first");
    }
    public void checkBalance(ATM atm){
        System.out.println("Insert card first");
    }
    public void removeCard(ATM atm){
        System.out.println("No card inserted");
    }
}