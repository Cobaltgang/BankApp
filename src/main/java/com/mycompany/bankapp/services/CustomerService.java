/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.services;

import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.database.Database;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author User
 */
public class CustomerService {
    Database d = new Database();
    private List<Customer> list = d.getCustomers();
    
    public List<Customer> getAllCustomers(){
        return list;
    }

    public Customer getCustomer(int id){
        return list.get(id-1);
    }
    public Customer createCustomer(Customer c){
        c.setID(list.size() +1);
        list.add(c);
        System.out.println("201 - resource created with path: /Customers/"  + String.valueOf(c.getID()));
        return c;
    }
}
