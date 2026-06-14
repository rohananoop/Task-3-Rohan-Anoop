class BankAccount{
    private String accountNumber;
    private int pin;
    private double balance;

    public BankAccount(String accNo,int p,double bal){
        accountNumber=accNo;
        pin=p;
        balance=bal;
    }
    public int getPin(){
        return pin;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("Deposit successful");
        }
        else
            System.out.println("Invalid amount");
    }
    public void withdraw(double amt){
        if(amt>balance)
            System.out.println("Insufficient balance");
        else if(amt<=0)
            System.out.println("Invalid amount");
        else{
            balance-=amt;
            System.out.println("Withdrawal successful");
        }
    }
}
