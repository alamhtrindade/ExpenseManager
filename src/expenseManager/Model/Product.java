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
public class Product extends Expense{

    private int qnt;
    
    public Product(String date,String description, int qnt, Double value) throws ParseException {
        super(date,"Produtos", value, description);
        this.qnt = qnt;
    }
    
    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    
}
