package exception_handling_two;

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

public class ATMSystem {

    static double balance = 10000;
    public static void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }

        balance =balance-amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public static void deposit(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0.");
        }

        if (amount < 100) {
            throw new InvalidAmountException("Minimum deposit amount is ₹100.");
        }

        balance =balance+ amount;
        System.out.println("Deposit Successful.");
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void checkBalance() {
        System.out.println("Available Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int invalidInputCount = 0;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;

                    case 3:
                        checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice.");
                }

            } catch (InputMismatchException e) {

                invalidInputCount++;
                System.out.println("Invalid numeric input.");

                sc.nextLine(); 

                if (invalidInputCount == 3) {
                    System.out.println("Too many invalid inputs. ATM Closed.");
                    break;
                }

            } catch (InvalidAmountException e) {

                System.out.println("InvalidAmountException: " + e.getMessage());

            } catch (InsufficientBalanceException e) {

                System.out.println("InsufficientBalanceException: " + e.getMessage());

            } finally {

                System.out.println("Transaction Logged.");

            }
        }

    }
}
