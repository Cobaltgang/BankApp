/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.database;
import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.models.Transaction;
import com.mycompany.bankapp.models.Account;
import java.util.*;
/**
 *
 * @author User
 */
public class database {
  
    
public static List<Customer> customerDB = new ArrayList<>();
public static List<Transaction> transactionDB = new ArrayList<>();
public static List<Account> accountDB = new ArrayList<>();
public static boolean init = true;

    public database() {
        if (init){
    

   

            
   Transaction t1 = new Transaction(1,"debit", "15/08/2019", "description", 100.00);
   Transaction t2 = new Transaction(2,"credit", "25/08/2019", "description", 200.00);
   Transaction t3 = new Transaction(3,"credit", "03/08/2019", "description", 300.00);
   Transaction t4 = new Transaction(4,"debit", "04/08/2019", "description", 400.00);
   Transaction t5 = new Transaction(5,"debit", "05/08/2019", "description", 500.00);
                
    transactionDB.add(t1);
    transactionDB.add(t2);
    transactionDB.add(t3);
    transactionDB.add(t4);
    transactionDB.add(t5);
    
   Account a1 = new Account(15548562, "154613BOF", "1415456315684", 10850.00,"bob", "debit", transactionDB);
   Account a2 = new Account(25548562, "2234613BOF", "2415456315684", 20850.00,"bob", "debit", transactionDB);
   Account a3 = new Account(35548562, "3524613BOF", "3415456315684", 30850.00,"bob", "debit", transactionDB);
   Account a4 = new Account(45548562, "457573BOF", "4415456315684", 40850.00,"bob", "debit", transactionDB);
   Account a5 = new Account(55548562, "558213BOF", "5415456315684", 50850.00,"bob", "debit", transactionDB);
   
   accountDB.add(a1);
   accountDB.add(a2);
   accountDB.add(a3);
   accountDB.add(a4);
   accountDB.add(a5);
   
    
   Customer c1 = new Customer (1,"james", "nowhere", "a19b69", "nptjames@yagoogle.com", "123435J", accountDB);
   Customer c2 = new Customer (2,"ASh", "nowhere", "a29b96", "nptash@yagoogle.com", "123435A", accountDB);
   Customer c3 = new Customer (3,"Jo", "nowhere", "a39b97", "nptjo@yagoogle.com", "123435K", accountDB);
   Customer c4 = new Customer (4,"Eoin", "nowhere", "a49b98", "npteoin@yagoogle.com", "123435S", accountDB);
   Customer c5 = new Customer (5,"Barry", "nowhere", "a59b99", "nptbarry@yagoogle.com", "123435B", accountDB);
          
   
   customerDB.add(c1);
   customerDB.add(c2);
   customerDB.add(c3);
   customerDB.add(c4);
   customerDB.add(c5);
   
   
   
   
   
   
    init = false;
   
   
    }
    }
    public static List<Customer> getCustomers(){
        return customerDB;
    }
    public static List<Transaction> getTransactions(){
        return transactionDB;
    }
    
}
