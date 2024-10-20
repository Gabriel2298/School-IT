package Sesiunea18.Expenses;

import java.time.LocalDate;

public class Expense {
    private LocalDate date;
    private String category;
    private String details;
    private double amount;

    public Expense(String category,double amount,LocalDate date,  String details) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.details = details;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Expense{" + "date=" + date + ", category='" + category +  ", details='" + details + '\'' + ", amount=" + amount + '}';
    }
}
