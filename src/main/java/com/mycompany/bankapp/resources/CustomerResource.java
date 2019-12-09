/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankapp.resources;

import com.mycompany.bankapp.services.CustomerService;
import com.mycompany.bankapp.models.Customer;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/comments")
@Consumes(MediaType.APPLICATION_JSON)
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
	
    @GET
    public List<Customer> getCustomers(@PathParam("messageID") int id) {
        System.out.println("getAllCustomers..."+id);
	return customerService.getAllCustomers();
    }
	
    
}

