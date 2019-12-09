$(document).ready(function() {
    $.ajax({
        url: "http://localhost:49000/bank/Customers/1/Accounts"
    }).then(function(data) {
        var listc= [];
       $.each(data, function (index, value) {
               listc.push(value.accType+", "); 
       })
       $('.cusID-Accounts').append(listc);    
    });
});
