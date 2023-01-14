/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import expenseManager.Interfaces.PutServiceInterface;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alamtrindade
 */
public class PutService implements PutServiceInterface{

    @Override
    public void putService(ArrayList<Expense> expenses, Service service, String directory) {
        expenses.add(service);
        RecordExpenses.recordExpense(expenses,directory);
    }
    
}
