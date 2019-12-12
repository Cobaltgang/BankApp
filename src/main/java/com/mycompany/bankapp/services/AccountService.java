/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.services;
import com.mycompany.bankapp.database.Database;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ash
 */
public class AccountService {
    Database d = new Database();
    private List<Account> list = d.getAccounts();
    
    public List<Account> getAllAccounts(){
        return list;
    }

    public Account getAccount(int id){
        return list.get(id-1);
    }
    public Account createAccount(Account a){
        TransactionService ts = new TransactionService();
        Transaction t = new Transaction();
        List<Transaction> tlist = new ArrayList();
        t.setBalance(0.0);
        t.setDate("Today");
        t.setDescription("Acount Opening Transaction");
        t.setTrxnType("NEW ACCOUNT TRXN");
        ts.createTransaction(t);
        tlist.add(t);
        a.setTransactions(tlist);
        a.setAccID(list.size() +1);
        list.add(a);
        System.out.println("201 - resource created with path: /Accounts/"  + String.valueOf(a.getAccID()));
        return a;
    }
}
