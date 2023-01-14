/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import javax.swing.JTextField;

/**
 *
 * @author alamtrindade
 */
public class ClearInputs {

    public ClearInputs() {
    }
    
    public void clear(JTextField jDate,JTextField jCNPJ,JTextField jDescription,JTextField jQtd,JTextField jValue){
        jDate.setText("");
        jCNPJ.setText("");
        jDescription.setText("");
        jQtd.setText("");
        jValue.setText("");
    }
}
