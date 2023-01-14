/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author alamtrindade
 */
public class Energy extends Expense{
    
    public Energy(String date, Double value) throws ParseException {
        super(date,"Energia Elétrica", value,"Energia Elétrica");
    }
    
}
