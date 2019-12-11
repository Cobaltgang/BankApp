/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:49000/bank/Customers"
    }).then(function(data) {
        var i;
        for (i = 0; i < data.length; i++) {
        i= data.length-1;
        var listc= [];
       $.each(data[i].accounts, function (index, value) {
               listc.push(value.accType+", "); 
       })
       $('.cus-Name').append(data[i].name);
       $('.cus-Email').append(data[i].email);
       $('.cus-Address').append(data[i].address);
       $('.cus-Accounts').append(listc);    
    }});
});
