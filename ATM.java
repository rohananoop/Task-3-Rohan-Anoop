import java.util.Scanner;

class ATM{
    private ATMState curr;
    private BankAccount acc;

    public ATM(BankAccount account){
        acc=account;
        curr=new IdleState();
    }
    public void setState(ATMState state){
        curr=state;
    }
    public BankAccount getAccount(){
        return acc;
    }
    public void insertCard(){
        curr.insertCard(this);
    }
    public void enterPin(Scanner sc){
        curr.enterPin(this,sc);
    }
    public void deposit(double amt){
        curr.deposit(this, amt);
    }
    public void withdraw(double amt){
        curr.withdraw(this, amt);
    }
    public void checkBalance(){
        curr.checkBalance(this);
    }
    public void removeCard(){
        curr.removeCard(this);
    }
}