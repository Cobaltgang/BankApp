/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.services;
import com.mycompany.bankapp.database.Database;
import com.mycompany.bankapp.models.Account;
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
        a.setAccID(list.size() +1);
        list.add(a);
        System.out.println("201 - resource created with path: /Accounts/"  + String.valueOf(a.getAccID()));
        return a;
    }
}
