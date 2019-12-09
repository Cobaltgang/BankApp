/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.models;

import java.util.List;

/**
 *
 * @author blras
 */
public class Transaction {
    private String TrxnType;
    private String date;
    private String description;
    private double balance;
    private int tranID;
    public Transaction(){}
     public Transaction(int tranID,String TrxnType, String data, String description, double balance){
        
        this.TrxnType = TrxnType;
        this.date = date;
        this.description=description;
        this.balance=balance;
        this.tranID=tranID;
    }

    public String getTrxnType() {
        return TrxnType;
    }

    public void setTrxnType(String TrxnType) {
        this.TrxnType = TrxnType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTranID() {
        return tranID;
    }

    public void setTranID(int tranID) {
        this.tranID = tranID;
    }
    
    
    
}
