/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp;

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


    
    private List<Customer> clist = database.getCustomers();
    
    public List<Customer> getAllCustomers() {
        return clist;
    }
    
    
}
