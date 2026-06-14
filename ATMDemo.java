import java.util.Scanner;

public class ATMDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account =new BankAccount("ACC1001", 1234, 1000);
        ATM atm = new ATM(account);        
        int choice;

        do{
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Insert Card");
            System.out.println("2. Enter PIN");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Remove Card");
            System.out.println("7. Exit");
            System.out.println("====================");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    atm.insertCard();
                    break;

                case 2:
                    atm.enterPin(sc);
                    break;

                case 3:
                    System.out.print("Enter Deposit Amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 4:
                    System.out.print("Enter Withdrawal Amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 5:
                    atm.checkBalance();
                    break;

                case 6:
                    atm.removeCard();
                    break;

                case 7:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 7);
        sc.close();
    }
}