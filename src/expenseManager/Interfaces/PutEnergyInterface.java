/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Interfaces;

import java.util.ArrayList;
import expenseManager.Model.Energy;
import expenseManager.Model.Expense;

/**
 *
 * @author alamtrindade
 */
public interface PutEnergyInterface {
    
    public abstract void putEnergy(ArrayList<Expense> expenses, Energy energy, String directory);
    
}
