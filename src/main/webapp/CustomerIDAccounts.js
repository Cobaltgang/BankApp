$(document).ready(function () {
    $.ajax({
        url: "http://localhost:49000/bank/Accounts"
    }).then(function (data) {
        var i;
        for (i = 0; i < data.length; i++) {
            i = data.length - 1;
            $('.cusID-Accounts').append(data[i].balance);
        }
    });
});
