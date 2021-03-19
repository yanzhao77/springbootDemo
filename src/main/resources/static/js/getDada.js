$(function () {
$.post({
    url:'user/getAll',
    success:function (data) {
        console.log(data)
        for (var i = 0; i <data.length ; i++) {
            var text='<tr>\n' +
                '            <td>'+data[i].id+'</td>\n' +
                '            <td>'+data[i].userName+'</td>\n' +
                '            <td>'+data[i].password+'</td>\n' +
                '            <td>'+data[i].createTime+'</td>\n' +
                '            <td>'+data[i].stratus+'</td>\n' +
                '            <td>\n' +
                '                <a href="user/delById?id='+data[i].id+'" class="btn btn-danger"></a>\n' +
                '                <a href="#" class="btn btn-success"></a>\n' +
                '            </td>\n' +
                '        </tr>';
            console.log(text);
            var aa="q"+"q";
            var obj=$(".pool");
            obj.append(text);
        }

    }
})
});