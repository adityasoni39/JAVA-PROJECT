import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    String name;
    String accountNumber;
    String pin;
    double balance;

    Account(String name, String accountNumber, String pin, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
}

public class BankManagementSystem 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Account> users = new ArrayList<>();

        
        users.add(new Account("Aditya", "123456", "6767", 5000));
        users.add(new Account("Udit", "323456", "6769", 3000));
        users.add(new Account("Anand", "423456", "6763", 10000));
        users.add(new Account("Salman", "523456", "6762", 7000));

        while (true) {

            System.out.println("\n====== ABC BANK ======");
            System.out.println("1. Login");
            System.out.println("2. Create New Account");
            System.out.println("3. Exit");

            System.out.print("Enter Choice : ");
            int mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {

                case 1:

                    System.out.print("Enter Account Number : ");
                    String account = sc.nextLine();

                    System.out.print("Enter PIN : ");
                    String pin = sc.nextLine();

                    Account currentUser = null;

                    for (Account user : users) {

                        if (user.accountNumber.equals(account) && user.pin.equals(pin)) {
                            currentUser = user;
                            break;
                        }
                    }

                    if (currentUser == null) {
                        System.out.println("Invalid Account Number or PIN");
                        break;
                    }

                    System.out.println("\nLogin Successful");
                    System.out.println("Welcome " + currentUser.name);

                    // ----------- Banking Menu -----------
                    int choice;

                    do {

                        System.out.println("\n===== BANK MENU =====");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Logout");

                        System.out.print("Enter Choice : ");
                        choice = sc.nextInt();

                        switch (choice) {

                            case 1:

                                System.out.print("Enter Deposit Amount : ");
                                double deposit = sc.nextDouble();

                                if (deposit > 0) {
                                    currentUser.balance += deposit;
                                    System.out.println("Deposit Successful");
                                    System.out.println("Balance : " + currentUser.balance);
                                } else {
                                    System.out.println("Invalid Amount");
                                }

                                break;

                            case 2:

                                System.out.print("Enter Withdraw Amount : ");
                                double withdraw = sc.nextDouble();

                                if (withdraw > 0 && withdraw <= currentUser.balance) {

                                    currentUser.balance -= withdraw;

                                    System.out.println("Withdraw Successful");
                                    System.out.println("Balance : " + currentUser.balance);

                                } else {

                                    System.out.println("Insufficient Balance");
                                }

                                break;

                            case 3:

                                System.out.println("Current Balance : " + currentUser.balance);

                                break;

                            case 4:

                                System.out.println("Logout Successful");

                                break;

                            default:

                                System.out.println("Invalid Choice");

                        }

                    } while (choice != 4);

                    break;

                case 2:

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number : ");
                    String newAccount = sc.nextLine();

                    boolean exists = false;

                    for (Account user : users) {

                        if (user.accountNumber.equals(newAccount)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {

                        System.out.println("Account Number Already Exists.");
                        break;
                    }

                    System.out.print("Create 4 Digit PIN : ");
                    String newPin = sc.nextLine();

                    users.add(new Account(name, newAccount, newPin, 0));

                    System.out.println("Account Created Successfully.");

                    break;

                case 3:

                    System.out.println("Thank You For Using ABC Bank.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
} 
    

