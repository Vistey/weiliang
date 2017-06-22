/**
 * Created by Sai on 2017/6/15.
 */

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