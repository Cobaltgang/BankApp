 
 $(document).ready(function() {
   $.ajax({
        url: "http://localhost:49000/bank/Customers"
    }).then(function(data) {
                    console.log(data);
                                        
                    var html = '';
                    var i;
                    for (i = 0; i < data.length; i++) {
                      html+='<span> <b>'+"Customer "+(i+1)+ " details "+'</b></span><p> </p>';
                      
                      html+='<span>'+"The Customer name is: "+data[i].name+". "+" "+'</span>';
                      html+='<span>'+"The email of the customer is: "+data[i].email+". "+'</span>'; 
                      html+='<span>'+"The Address of customer is: "+data[i].address+". "+'</span>';
                       
                       var listc= [];
                       listc.push("The accouns of this customer are: ")
                       $.each(data[i].accounts, function (index, value) {
                            listc.push(value.accType+" "); 
                        });
                        html+='<span>'+listc+'</span>';
                        html+='<p>'+" "+'</p>';
                    }
                    console.log(html);
                    $('.cust').append(html);
                    
                }); 
            });
