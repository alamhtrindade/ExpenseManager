/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Interfaces;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import expenseManager.Model.Expense;

/**
 *
 * @author alamtrindade
 */
public interface LoadExpensesInterface {
     
    public abstract void loadExpenses(ArrayList<Expense> expenses, JTable tExpenses, JLabel lValue, int month, int year);
    
}
