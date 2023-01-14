/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Interfaces;

import java.util.ArrayList;
import expenseManager.Model.Expense;
import expenseManager.Model.Product;

/**
 *
 * @author alamtrindade
 */
public interface PutProductInterface {
    
     public abstract void putProduct(ArrayList<Expense> expenses, Product product, String directory);
    
}
