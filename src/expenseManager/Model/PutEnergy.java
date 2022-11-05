/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import expenseManager.Interfaces.PutEnergyInterface;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author alamtrindade
 */
public class PutEnergy implements PutEnergyInterface{

    @Override
    public void putEnergy(ArrayList<Expense> expenses, Energy energy, String directory) {
        expenses.add(energy);
        RecordExpenses.recordExpense(expenses,directory);
    }
    
}
