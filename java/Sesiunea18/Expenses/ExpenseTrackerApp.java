package Sesiunea18.Expenses;

import java.time.LocalDate;
import java.util.Scanner;

//Expense Tracker Console Application
//Create a console application where users can record their daily expenses under various categories (like food, transportation, etc.).
// Users should be able to view, add, edit, and delete these records.  Upon completion, package your application as a JAR file for demonstration.
//
//Features:
//Add, view, edit, and delete expense records
//View total expenses for a given time period
//Export expense reports as a text file (nice to have, feature)
//
//Skills Applied:
//File I/O
//Data Structures (List, Map)
//Loops, Conditional Statements

public class ExpenseTrackerApp {
    public static void main(String... args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        boolean task = true;
        while (task) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add expense");
            System.out.println("2. Edit expense");
            System.out.println("3. Delete expense");
            System.out.println("4. View expense");
            System.out.println("5. Calculate total expense");
            System.out.println("6. Export expense");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Entry date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(scanner.next());
                    scanner.nextLine();
                    System.out.print("Entry category of expense: ");
                    String category = scanner.nextLine();
                    System.out.print("Entry amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entry details:  ");
                    String details = scanner.nextLine();

                    expenseTracker.addExpense(new Expense(category, amount, date, details));
                    break;
                case 2:
                    expenseTracker.viewExpenses();
                    System.out.print("Enter the category of expense what you want to edit: ");
                    category = scanner.nextLine();
                    System.out.print("Enter the index of the expense to edit: ");
                    int index1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entry new date (YYYY-MM-DD): ");
                    date = LocalDate.parse(scanner.next());
                    scanner.nextLine();
                    System.out.print("Entry new category: ");
                    String newCategory = scanner.nextLine();
                    System.out.print("Entry new amount: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entry new details: ");
                    details = scanner.nextLine();
                    expenseTracker.editExpense(category, index1, new Expense(newCategory, amount, date, details));
                    break;
                case 3:
                    expenseTracker.viewExpenses();
                    System.out.print("Entry the category of the expense to delete: ");
                    category = scanner.nextLine();
                    System.out.print("Entry the index of expense to delete: ");
                    index1 = scanner.nextInt();
                    expenseTracker.deleteExpense(category, index1);
                    break;
                case 4:
                    expenseTracker.viewExpenses();
                    break;
                case 5:
                    System.out.print("Entry start date(YYYY-MM-DD): ");
                    LocalDate startDate = LocalDate.parse(scanner.next());
                    System.out.print("Entry end date(YYYY-MM-DD): ");
                    LocalDate endDate = LocalDate.parse(scanner.next());
                    double total = expenseTracker.calculateExpenses(startDate, endDate);
                    System.out.println("Total expense from " + startDate + " to " + endDate + ": " + total);
                    break;
                case 6:
                    System.out.print("Entry filename to export: ");
                    String filename = scanner.nextLine();
                    expenseTracker.exportExpenses(filename);
                    break;
                case 7:
                    task = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
        scanner.close();
    }
}

