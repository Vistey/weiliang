
$(function () {
    $.ajax({
        url: 'userset/getCertificateExpired.do',
        success: function (data) {
            console.log(data);
            var tmp ;
            var json = jQuery.parseJSON(data);
            if (json.length < 1) {
                $("#promptList").remove();
            } else {
                $("#promptList").html(json.length);
                for (var i = 0 ; i < json.length ; i ++){
                    tmp +='<li>' +
                        '<div>' +
                        '<i class="fa fa-envelope fa-fw"></i>证件过期' +
                        '<span class="pull-right text-muted small">'+json[i]+'</span>' +
                        '</div>' +
                        '</li>' +
                        '<li class="divider"></li>';
                }
                $("#shouList").html(tmp);
            }
        }
    });
});

$("#logout").click(function () {
    $.ajax({
        url: 'userset/logout.do',
        type: 'get',
        success: function (data) {
            if (data === 'true')
                location.reload();
        }
    })
});