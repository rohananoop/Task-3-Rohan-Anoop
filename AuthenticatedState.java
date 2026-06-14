import java.util.Scanner;

class AuthenticatedState implements ATMState{
    public void insertCard(ATM atm){
        System.out.println("Card already inserted");
    }
    public void enterPin(ATM atm,Scanner sc){
        System.out.println("Pin already entered");
    }
    public void deposit(ATM atm,double amt){
        atm.getAccount().deposit(amt);
    }
    public void withdraw(ATM atm,double amt){
        atm.getAccount().withdraw(amt);
    }
    public void checkBalance(ATM atm){
        System.out.println("Balance: Rs. "+atm.getAccount().getBalance());
    }
    public void removeCard(ATM atm){
        System.out.println("Card removal successful");
        atm.setState(new IdleState());
    }
}
