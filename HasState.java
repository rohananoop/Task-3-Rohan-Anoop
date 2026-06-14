import java.util.Scanner;

class HasState implements ATMState{
    public void insertCard(ATM atm){
        System.out.println("Card already inserted");
    }
    public void enterPin(ATM atm,Scanner sc){
        System.out.println("Enter pin: ");
        int pin=sc.nextInt();
        if(pin==atm.getAccount().getPin()){
            System.out.println("Authentication successful");
            atm.setState(new AuthenticatedState());
        }
        else
            System.out.println("Invalid pin");
    }
    public void deposit(ATM atm,double amt){
        System.out.println("Enter pin first");
    }
    public void withdraw(ATM atm,double amt){
        System.out.println("Enter pin first");
    }
    public void checkBalance(ATM atm){
        System.out.println("Enter pin first");
    }
    public void removeCard(ATM atm){
        System.out.println("Card removal successful");
        atm.setState(new IdleState());
    }
}