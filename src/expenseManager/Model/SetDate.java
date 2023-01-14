/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author alamtrindade
 */
public class SetDate {
    
    public SetDate() {
    }
    
    public void showDate(JLabel lDate) {
        
        StringBuffer buffDate = new StringBuffer();
        Date date = new Date();
        
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        buffDate.append(dateFormater.format(date));
        
        
        lDate.setText(buffDate.toString());
    }
}
