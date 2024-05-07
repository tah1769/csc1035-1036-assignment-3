package assignment3.packages.expense;

import assignment3.packages.category.Category;
import assignment3.packages.currency.Currency;

import java.io.Serializable;
import java.time.LocalDate;

public record Expense(double amount, Category category, Currency currency, LocalDate date) implements Serializable { }