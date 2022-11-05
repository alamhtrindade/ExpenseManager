/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alamtrindade
 */
public class RecordExpenses {
    
    public static void recordExpense(ArrayList<Expense> expenses, String directory) {

        
        File dirName = new File(directory);
        
        if (!dirName.exists()) {
            dirName.mkdir();
        }
        
        ObjectOutputStream file = null;
        try {
            
            file = new ObjectOutputStream(new FileOutputStream(directory + "/despesas.txt"));
            file.writeObject(expenses);
            
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                file.close();
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}
