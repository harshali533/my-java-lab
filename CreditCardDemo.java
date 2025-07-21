import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limit = 20000;
        double balance = limit;

        System.out.print("Enter Cardholder Name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome, " + name + "! Your card limit is ₹" + limit);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Make Purchase");
            System.out.println("2. Repay Amount");
            System.out.println("3. View Balance");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter purchase amount: ₹");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Purchase successful! Remaining: ₹" + balance);
                } else {
                    System.out.println("Not enough credit!");
                }
            } else if (choice == 2) {
                System.out.print("Enter repayment amount: ₹");
                double repay = sc.nextDouble();
                if (balance + repay <= limit) {
                    balance += repay;
                    System.out.println("Repayment successful! New balance: ₹" + balance);
                } else {
                    System.out.println("Cannot exceed credit limit.");
                }
            } else if (choice == 3) {
                System.out.println("Available Credit: ₹" + balance);
            } else if (choice == 0) {
                System.out.println("Thank you! Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
