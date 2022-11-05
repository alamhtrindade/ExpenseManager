/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alamtrindade
 */
public class ReadExpenses {
    
    public static ArrayList<Expense> returnExpenses(String directory) {
        
         ArrayList<Expense> expenses = new ArrayList<Expense>();
        
        File volumInformation = new File(directory + "/despesas.txt");
        
        if(!volumInformation.exists()) {
            return expenses;
        }
        
        ObjectInputStream file = null;
        try {
            file = new ObjectInputStream(new FileInputStream(volumInformation));
            expenses = (ArrayList<Expense>)file.readObject();
        } catch(Exception ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        
        return expenses;
    }
}
