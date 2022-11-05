/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import expenseManager.Interfaces.LoadExpensesInterface;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alamtrindade
 */
public class LoadExpenses implements LoadExpensesInterface{
    private double totalValue;
    
    @Override
    public void loadExpenses(ArrayList<Expense> expenses, JTable tExpenses, JLabel lValue , int month, int year) {
        
        this.totalValue = 0;
        
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        DefaultTableModel tableExpenses = (DefaultTableModel) tExpenses.getModel();

        while (tableExpenses.getRowCount() > 0) {
            tableExpenses.removeRow(0);
        }
        

        try {
            
            Date beginDate = dateFormater.parse("01/"+month+"/"+year);
            
            Date endDate = dateFormater.parse("31/"+month+"/"+year);
            
            for (Expense expense : expenses) {
                
                //Se a Data Inicial For Menor que a Data do serviço 
                if( (beginDate.compareTo(expense.getDate()) <= 0) && (endDate.compareTo(expense.getDate())>= 0)){
                    Object[] row = {expense.getType(), expense.getDescription(),expense.getValue()};
                    tableExpenses.addRow(row);
                    this.totalValue = this.totalValue + expense.getValue();
                }
                
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(LoadExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        DecimalFormat valueFormated =  new DecimalFormat();
        valueFormated.setMaximumFractionDigits(2);
        lValue.setText(valueFormated.format(this.totalValue));
    }

}
