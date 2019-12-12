/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.services;
import com.mycompany.bankapp.database.Database;
import com.mycompany.bankapp.models.Transaction;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Customer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ash
 */
public class TransactionService {
    Database d = new Database();
    private List<Transaction> tlist = d.getTransactions();
    private List<Account> alist = d.getAccounts();
    
    public List<Transaction> getAllTransactions(){
        return tlist;
    }
    public List<Transaction> getAllTransactionsByAccounts(int AccID){
        return alist.get(AccID-1).getTransactions();
    }
    public Transaction getTransactionID(int id){
        return tlist.get(id-1);
    }
        public void setbalance(Transaction t){
        try{
        Database dl = new Database();
        List<Customer> clist = dl.getCustomers();
        Customer cus = clist.get(clist.size()-1);
        List<Account> alist = cus.getAccounts();
        Account a = alist.get(alist.size()-1);
        List<Transaction> tlist = a.getTransactions();
        String check = t.getTrxnType();
        System.out.println(check);
        double d=a.getBalance();
        double e = t.getBalance();
        double c=0.0;
        if(check.equalsIgnoreCase("credit")){
            c = d+e;
        }
        else if(check.equalsIgnoreCase("debit")){
             c = d-e;
        }
        a.setBalance(c);
        tlist.add(t);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public Transaction createTransaction(Transaction t){
        setbalance(t);
        t.setTranID(tlist.size() +1);
        tlist.add(t);
        System.out.println("201 - resource created with path: /Transactions/"  + String.valueOf(t.getTranID()));
        return t;
    }
}
