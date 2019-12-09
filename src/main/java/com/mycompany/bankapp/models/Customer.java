/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.models;

import java.util.List;

/**
 *
 * @author Ash
 */
public class Customer {
    private String Name;
    private String Address;
    private String Eircode;
    private String Email;
    private String PPS;
    private int ID;
    private List<Account> Accounts;
    
    public Customer(int ID, String Name, String Address, String Eircode, String Email, String PPS, List<Account> Accounts){
        
        this.ID = ID;
        this.Name = Name;
        this.Address=Address;
        this.Eircode=Eircode;
        this.Email=Email;
        this.PPS = PPS;
        this.Accounts=Accounts;
    }

    public int getID() {
        return ID;
    }

    public List<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(List<Account> Accounts) {
        this.Accounts = Accounts;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEircode() {
        return Eircode;
    }

    public void setEircode(String Eircode) {
        this.Eircode = Eircode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        this.PPS = PPS;
    }
   
}
