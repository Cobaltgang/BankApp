/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.resources;
import com.mycompany.bankapp.database.Database;
import com.mycompany.bankapp.models.Account;
import com.mycompany.bankapp.models.Customer;
import com.mycompany.bankapp.models.Transaction;
import com.mycompany.bankapp.services.TransactionService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author Ash
 */
@Path("/Transactions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionResource {
    private TransactionService TransactionService = new TransactionService();
    

    @GET
    public List<Transaction> getTransactions(@PathParam("AccountID") int id){
        try{
            System.out.println("getAllTransactiosForAccount..."+id);
        return TransactionService.getAllTransactions();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
    @GET
    @Path("/{tranId}")
    public Transaction getTransaction(@PathParam("tranId") int id){
        try{
            System.out.println("getTransactionById..."+id);
        return TransactionService.getTransactionID(id);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
    @POST
    public Transaction createTransaction(Transaction t){
        try{
        return TransactionService.createTransaction(t);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
}
