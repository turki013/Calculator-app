
import java.time.LocalDateTime;
import java.util.Scanner;

public class Account2Class {

    static String user = "admin";
    static String pass = "password";
    static String conformpass = "password";
    static LocalDateTime lastLogin = LocalDateTime.now();
    static boolean isLoggedIn = false;
    static Scanner input = new Scanner(System.in);

    static void signUp() {

        System.out.println("Enter the user: ");
        user = input.nextLine();
        System.out.println("Enter the password: ");
        pass = input.nextLine();
        System.out.println("Conform the password: ");
        conformpass = input.nextLine();
        if (pass.equals(conformpass)) {
            System.out.println("The account has been created successfully");
        } else {
            System.out.println("The password does not match");
        }
    }

    static boolean login() {
        if (user == null || pass == null) {
            System.out.println("The account does not exist");
            return false;
        } else {
            System.out.println("Enter ur user: ");
            String user1 = input.nextLine();
            System.out.println("Enter ur password: ");
            String pass1 = input.nextLine();
            if (user.equals(user1) && pass.equals(pass1)) {
                System.out.println("The account has been logged in successfully");
                isLoggedIn = true;
                lastLogin();
                return true;

            } else {
                System.out.println("The user or password is incorrect");
                return false;
            }
        }
    }

    static void lastLogin() {
        System.out.println("The last login was: " + lastLogin);
        lastLogin = LocalDateTime.now();
    }

    static void forgetPassword() {
        System.out.println("Enter the user: ");
        String user1 = input.nextLine();
        if (user.equals(user1)) {
            System.out.println("Enter the new password: ");
            pass = input.nextLine();
            System.out.println("The password has been changed successfully");
        } else {
            System.out.println("The user does not exist");
        }
    }

    static void ResetPassword() {
        System.out.println("Enter ur current password: ");
        String currentPassword = input.nextLine();
        if (currentPassword.equals(pass)) {
            System.out.println("Enter the new password: ");
            pass = input.nextLine();
            System.out.println("The password has been changed successfully");
        } else {
            System.out.println("The password is incorrect");

        }
    }

    static void deleteAccount() {
        System.out.print("Are you sure you want to delete the account? (yes/no): ");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            user = null;
            pass = null;
            System.out.println("The account has been deleted successfully");
        } else {
            System.out.println("The account has not been deleted");
        }
    }

}

class Calculator {

    static void startCalculator() {
        while (true) {

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5.Esspression");
            System.out.println("6. Exit");
            int option = Account2Class.input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int a = Account2Class.input.nextInt();
                    System.out.println("Enter the second number: ");
                    int b = Account2Class.input.nextInt();
                    System.out.println("The result is: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    int c = Account2Class.input.nextInt();
                    System.out.println("Enter the second number: ");
                    int d = Account2Class.input.nextInt();
                    System.out.println("The result is: " + subtract(c, d));
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    int e = Account2Class.input.nextInt();
                    System.out.println("Enter the second number: ");
                    int f = Account2Class.input.nextInt();
                    System.out.println("The result is: " + multiply(e, f));
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    int g = Account2Class.input.nextInt();
                    System.out.println("Enter the second number: ");
                    int h = Account2Class.input.nextInt();
                    System.out.println("The result is: " + divide(g, h));
                    break;
                case 5:
                    System.out.println("Enter the first number: ");
                    int i = Account2Class.input.nextInt();
                    System.out.println("Enter the second number: ");
                    int j = Account2Class.input.nextInt();
                    System.out.println("Enter the third number: ");
                    int k = Account2Class.input.nextInt();
                    System.out.println("The result is: " + Expression(i, j, k));
                    break;
                case 6:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("The number cannot be divided by zero");
            return 0;
        }
        return a / b;
    }

    static int Expression(int a, int b, int c) {
        return a + b * c;
    }

}
