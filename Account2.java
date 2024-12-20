
import java.util.Scanner;

public class Account2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int option;

        do {
            System.out.println("\n=== welcom to calculator app=====");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Forget password");
            System.out.println("4. Reset password");
            System.out.println("5. Delete account");
            System.out.println("6. Exit");
            System.out.print("Enter an option: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    Account2Class.sginUp();
                    break;
                case 2:
                    Account2Class.login();
                    break;
                case 3:
                    Account2Class.forgetPassword();
                    break;
                case 4:
                    Account2Class.ResetPassword();
                    break;
                case 5:
                    Account2Class.deleteAccount();
                    break;
                case 6:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            if (Account2Class.isLoggedIn) {
                System.out.println("You are logged in. Accessing the calculator...");
                CalculatorMenu();
            }
        } while (option != 6);
    }

    static void CalculatorMenu() {
        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Open Calculator");
            System.out.println("2. Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (Account2Class.isLoggedIn) {
                if (choice == 1) {
                    Calculator.startCalculator();
                } else if (choice == 2) {
                    System.out.println("Exiting Calculator Menu...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("You need to log in first!");
                break;
            }
        }
    }
}
