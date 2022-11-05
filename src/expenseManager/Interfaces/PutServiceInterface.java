/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Interfaces;

import java.util.ArrayList;
import expenseManager.Model.Expense;
import expenseManager.Model.Service;

/**
 *
 * @author alamtrindade
 */
public interface PutServiceInterface {
    
    public abstract void putService(ArrayList<Expense> expenses, Service service, String directory);
            
}
