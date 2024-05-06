package assignment3.packages.expense;

import assignment3.packages.category.Category;

import java.io.Serializable;
import java.time.LocalDate;

public record Expense(double amount, Category category, LocalDate date) implements Serializable { }