import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        // Create Scanner to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask how many customers you want to check
        System.out.print("Enter number of customers to check: ");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\n--- Customer " + i + " ---");

            // Take  inputs
            System.out.print("Enter Account Number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter Balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter Total Charges this month: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter Total Credits this month: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter Allowed Credit Limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Display result
            System.out.println("Account Number: " + accountNumber);
            System.out.println("New Balance: " + newBalance);

            // Check if credit limit exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Within the credit limit");
            }
        }

        // Close scanner
        input.close();
    }
}