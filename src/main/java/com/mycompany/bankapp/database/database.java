/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.database;
import com.mycompany.bankapp.models.Customer;
import java.util.*;
/**
 *
 * @author User
 */
public class database {
  
    
public static List<Customer> customerDB = new ArrayList<>();

    public database() {
    
   Customer c = new Customer (1,"james","nowhere","a69b69","nptjames@yagoogle.com","123435J");
   
   customerDB.add(c);
    }
    public static List<Customer> getCustomers(){
        return customerDB;
    }   
    
}
