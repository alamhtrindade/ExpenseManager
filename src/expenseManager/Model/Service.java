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
public class Service extends Expense{
    
    private String cnpj;
    
    public Service(String date, Double value, String cnpj, String description) throws ParseException {
        super(date,"Serviços", value, description);
        this.cnpj = cnpj;
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

        
}
