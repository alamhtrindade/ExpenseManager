/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import expenseManager.Interfaces.PutProductInterface;
import java.util.ArrayList;

/**
 *
 * @author alamtrindade
 */
public class PutProduct implements PutProductInterface{

    @Override
    public void putProduct(ArrayList<Expense> expenses, Product product, String directory) {
        expenses.add(product);
        RecordExpenses.recordExpense(expenses,directory);
    }
    
}
