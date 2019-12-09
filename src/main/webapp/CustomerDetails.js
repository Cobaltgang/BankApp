/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:49000/bank/Customers/1"
    }).then(function(data) {
        var listc= [];
       $.each(data.accounts, function (index, value) {
               listc.push(value.accType+", "); 
       })
       $('.cus-Name').append(data.name);
       $('.cus-Email').append(data.email);
       $('.cus-Address').append(data.address);
       $('.cus-Accounts').append(listc);    
    });
});
