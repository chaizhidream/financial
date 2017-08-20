<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://www.w3dev.cn/rardownload/20130106/20130106170832648.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.4.2.min.js"></script>

</head>
<body>
<script>
    $.ajax({
        url: 'http://query.yahooapis.com/v1/public/yql',
        dataType: 'jsonp',
        data: {
            q: "select * from json where url=\"http://hq.sinajs.cn/list=sh601006\"",
            format: "json"
        },
        success: function (d) {
           alert(JSON.stringify(d))//远程json数据放在query.results下
        }
    });</script>
</body>
</html>