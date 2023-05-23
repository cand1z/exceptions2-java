package application;

import model.entities.Account;
import model.exceptions.AccountExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount  = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Insert error: Verify the type inserted");
        } catch (AccountExceptions e) {
            System.out.println();
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
