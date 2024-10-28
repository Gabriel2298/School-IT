package Sesiunea18.Expenses;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseTracker {
    private final Map<String, List<Expense>> expenseList;

    public ExpenseTracker() {
        expenseList = new HashMap<>();
    }
    public void addExpense(Expense expense) {
        expenseList
                .computeIfAbsent(expense.getCategory(), k -> new ArrayList<>())
                .add(expense);
    }
    public void editExpense(String category, int i, Expense newExpense) {
        List<Expense> expenses = expenseList.get(category);
        if (expenses != null && i >= 0 && i < expenseList.size()) {
            expenses.set(i, newExpense);
        } else {
            System.out.println("Invalid index or category!");
        }
    }
    public void deleteExpense(String category, int i) {
        List<Expense> expenses = expenseList.get(category);
        if (expenses != null && i >= 0 && i < expenseList.size()) {
            expenses.remove(i);
            if (expenses.isEmpty()) {
                expenseList.remove(category);
            }
        } else {
            System.out.println("Invalid index or category!");
        }
    }
    public void viewExpenses(){
        if(expenseList.isEmpty()){
            System.out.println("No expenses recorded!");
        }else{
            for (String category : expenseList.keySet()){
                System.out.println("Category: " + category);
                List<Expense> expenses = expenseList.get(category);
                for (int i = 0; i < expenses.size(); ++i) {
                    System.out.println(" " + i + ": " + expenses.get(i));
                }
            }
        }
    }
    public double calculateExpenses(LocalDate startDate, LocalDate endDate){
        double total = 0;
        for (List<Expense> expenses : expenseList.values()){
            for (Expense expense : expenses){
                if (!expense.getDate().isBefore(startDate)&& !expense.getDate().isAfter(endDate)){
                    total += expense.getAmount();
                }
            }
        }
        return total;
    }
    public void exportExpenses(String filename){
        try(FileWriter writer = new FileWriter(filename)){
            for (String category : expenseList.keySet()){
                writer.write("Category: " + category + "\n");
                for (Expense expense : expenseList.get(category)){
                    writer.write(" " + expense.toString()+ "\n");
                }
            }
            System.out.println("Expenses exported to: " + filename);
        }catch (IOException e){
            System.out.println("You have an error to exporting: " + e.getMessage());
        }
    }
}
