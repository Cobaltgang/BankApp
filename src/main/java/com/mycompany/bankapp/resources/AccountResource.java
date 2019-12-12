/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.resources;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.services.CustomerService;
import com.mycompany.bankapp.services.AccountService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author Ash
 */
@Path("/Accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {
    AccountService AccountService = new AccountService();
  
    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
    */    
    @GET
    public List<Account> getAccounts() {
        return AccountService.getAllAccounts();
    }
    
    @GET
    @Path("/{accountid}")
    public Account getAccount(@PathParam("accountid") int id) {
        try{
            return AccountService.getAccount(id);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }

    
    /*
    * When using POSTMAN remember to include in Headers: Content-type : application/json
    * and include in the body of the request in RAW format the object in JSON notation
    */
    @POST
    public Account postAccount(Account a) {
        try{
            return  AccountService.createAccount(a);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
      
    }
 

    
    
    /*
     * Search for a Message 
     * GET http://localhost:49000/api/messages?author=Jack&message=helloworld
     * either by @QueryParam message content
     * or by @QueryParam author
     */

    
    @Path("/{accountid}/transactions")
    public AccountResource getAccountResource() {
        try{
            System.out.println("Getting Accounts subresoruces...");
	return new AccountResource();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
	
    }
}
