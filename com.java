
    import java.util.Scanner;

public class com {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Data
        String[][] users = {
                {"Aditya", "123456", "6767"},
                {"Udit", "323456", "6769"},
                {"Anand", "423456", "6763"},
                {"Salman", "523456", "6762"}
        };

        double balance = 0;
        boolean login = false;

        System.out.println("===== WELCOME TO ABC BANK =====");

        // Login
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String account = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        // Check Login
        for (int i = 0; i < users.length; i++) {

            if (users[i][0].equalsIgnoreCase(name)
                    && users[i][1].equals(account)
                    && users[i][2].equals(pin)) {

                login = true;
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome " + users[i][0]);
                break;
            }
        }

        if (!login) {
            System.out.println("Invalid Login Details!");
            sc.close();
            return;
        }

        int choice;

        do {

            System.out.println("\n====== MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful");
                        System.out.println("Current Balance : " + balance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 2:

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Withdraw Successful");
                        System.out.println("Current Balance : " + balance);
                    } else {
                        System.out.println("Insufficient Balance or Invalid Amount");
                    }

                    break;

                case 3:

                    System.out.println("Current Balance : " + balance);

                    break;

                case 4:

                    System.out.println("Thank You For Using ABC Bank");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

