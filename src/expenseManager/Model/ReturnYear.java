/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alamtrindade
 */
public class ReturnYear {
    public static int setYear(){
        
        Date year = new Date();
    	
        Calendar calendar = Calendar.getInstance();
    	calendar.setTime(year);
        
        return calendar.get(Calendar.YEAR);
    }
}
