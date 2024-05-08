package assignment3.packages.expense.savedExpenses;

import assignment3.packages.expense.Expense;

import javax.swing.table.AbstractTableModel;
import java.util.List;


public class SavedExpenses extends AbstractTableModel {
    private final String[] columnNames = {"Amount", "Currency", "Category", "Date"};
    private List<Expense> expenses;

    public SavedExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }


    public List<Expense> getExpenses() {
        return expenses;
    }

    @Override
    public int getRowCount() {
        return expenses.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Expense expense = expenses.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> expense.amount();
            case 1 -> expense.currency().getDisplayName();
            case 2 -> expense.category().getDisplayName();
            case 3 -> expense.date().toString();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }


    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
        this.fireTableDataChanged(); // Notifies the table that the data has changed
    }
}
