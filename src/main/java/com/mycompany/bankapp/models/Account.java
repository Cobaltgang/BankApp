/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.models;

/**
 *
 * @author blras
 */
public class Account {
    private String SortCode;
    private String AccNo;
    private Double Balance;
    private String CustomerName;

    public Account(String sortcode, String accno, Double balance, String name){
        SortCode=sortcode;
        AccNo = accno;
        Balance = balance;
        CustomerName= name;
    }
    
    
    public String getSortCode() {
        return SortCode;
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
