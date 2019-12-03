/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp;

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
    
    public Customer(String name, String address, String eircode, String email, String pps){
        name = Name;
        address=Address;
        eircode=Eircode;
        email=Email;
        pps = PPS;
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
