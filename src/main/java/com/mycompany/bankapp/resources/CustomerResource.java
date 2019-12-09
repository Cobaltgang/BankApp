/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.resources;

import com.mycompany.bankapp.services.CustomerService;
import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Transaction;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Customers")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)

/**
 *
 * @author User
 */
public class CustomerResource {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    private CustomerService customerService = new CustomerService();
	

    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
    */    
    @GET
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
    
    @GET
    @Path("/{customerid}")
    public Customer getCustomer(@PathParam("customerid") int id) {
        return customerService.getCustomer(id);
    }

    
    /*
    * When using POSTMAN remember to include in Headers: Content-type : application/json
    * and include in the body of the request in RAW format the object in JSON notation
    */
    @POST

    public Customer postCustomer(@FormParam("name") String name,
                                         @FormParam("address") String address,
                                         @FormParam("eircode") String eircode,
                                         @FormParam("email") String email,
                                         @FormParam("pps") String pps) {
        List<Account> alist = new ArrayList();
        Account a = new Account();
        a.setAccID((int) Math.random());
        a.setAccNo(UUID.randomUUID().toString());
        a.setAccType("Savings");
        a.setBalance(Double.NaN);
        a.setCustomerName(name);
        a.setSortCode(UUID.randomUUID().toString());
        a.setTransactions(null); 
        alist.add(a);
        int id = (int)Math.random();
        Customer c = new Customer(id,name,address,eircode,email,pps,alist);
	return customerService.createCustomer(c);
    }

    
    /*
     * Search for a Message 
     * GET http://localhost:49000/api/messages?author=Jack&message=helloworld
     * either by @QueryParam message content
     * or by @QueryParam author
     */

    
    @Path("/{customerid}/Accounts")
    public CustomerResource getCustomerResource() {
	System.out.println("Getting Cstomer subresoruces...");
	return new CustomerResource();
    }
	
    
}

