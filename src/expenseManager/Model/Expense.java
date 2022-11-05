/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseManager.Model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alamtrindade
 */
public class Expense implements Serializable, Comparable<Expense>{
    
    private Date date;
    private Double value;
    private String description;
    private String type;

    public Expense(String dateReceived, String type, Double value, String description) throws ParseException {
        
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        
        this.date = formater.parse(dateReceived);
        this.value = value;
        this.description = description;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Expense expense) {
        if(this.value > expense.getValue()){
            return -1;
        }if(this.value < expense.getValue()){
            return 1;
        }
        return 0;  
    }
    
    
    
}
