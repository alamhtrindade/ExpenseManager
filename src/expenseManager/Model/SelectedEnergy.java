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
public class SelectedEnergy {

    public SelectedEnergy() {
    }
    
     
    public void EnergySelected(JTextField jDate,JTextField jCNPJ,JTextField jDescription,JTextField jQtd,JTextField jValue){
        jDate.setEnabled(true);
        jCNPJ.setEnabled(false);
        jDescription.setEnabled(false);
        jQtd.setEnabled(false);
        jValue.setEnabled(true);
    }
}
