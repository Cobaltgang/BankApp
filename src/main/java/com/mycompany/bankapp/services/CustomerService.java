/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.services;

import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.database.Database;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Transaction;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
        List<Account> alist = new ArrayList();
        
        Account a = new Account();
        
        a.setAccNo(UUID.randomUUID().toString());
        a.setAccType("Current");
        a.setBalance(0.0);
        a.setCustomerName(c.getName());
        a.setSortCode(UUID.randomUUID().toString());
        AccountService as = new AccountService();
        as.createAccount(a);
        alist.add(a);
        c.setAccounts(alist);
        c.setID(list.size() +1);
        list.add(c);
        System.out.println("201 - resource created with path: /Customers/"  + String.valueOf(c.getID()));
        return c;
    }
}
