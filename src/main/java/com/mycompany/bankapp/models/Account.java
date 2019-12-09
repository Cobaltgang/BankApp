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
public class Account {
    private int AccID;
    private String SortCode;
    private String AccNo;
    private Double Balance;
    private String CustomerName;
    private String AccType;
    private List<Transaction> Transactions;
    public Account(){}
    public Account(int AccID, String SortCode, String AccNo, Double Balance,String AccType, String CustomerName, List<Transaction> Transactions){
        this.AccID=AccID;
        this.SortCode=SortCode;
        this.AccNo=AccNo;
        this.Balance=Balance;
        this.AccType=AccType;
        this.CustomerName=CustomerName;
        this.Transactions=Transactions;
    }

    public List<Transaction> getTransactions() {
        return Transactions;
    }

    public void setTransactions(List<Transaction> Transactions) {
        this.Transactions = Transactions;
    }
    
    
    public String getSortCode() {
        return SortCode;
    }

    public int getAccID() {
        return AccID;
    }

    public void setAccID(int AccID) {
        this.AccID = AccID;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }

    public void setSortCode(String SortCode) {
        this.SortCode = SortCode;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
    
}
