<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
window.onload=function(){
//alert(">>>");
showInfo();
}

function showInfo(){
         var selectvalue=document.getElementById('stock').value;
	var element = document.getElementById('daily');
	element.src = "http://image.sinajs.cn/newchart/daily/n/sh"+selectvalue+".gif";

	
	var element = document.getElementById('min');
	element.src = "http://image.sinajs.cn/newchart/min/n/sh000001.gif";
	
	
    	var test=["今日开盘价:",
    			"昨日收盘价:",
    			"当前价格:",
    			"今日最高价:",
    			"今日最低价:",
    			"竞买价，即“买一”报价:",
    			"竞卖价，即“卖一”报价:",
    			"成交的股票数:",
    			"成交金额(元):",
    			"“买一”申请股票数量:",
    			"“买一”报价:",
    			"“买二”申请股票数量:",
    			"“买二”报价:",
    			"“买三”申请股票数量:",
    			"“买三”报价:",
    			"“买四”申请股票数量:",
    			"“买四”报价:",
    			"“买五”申请股票数量:",
    			"“买五”报价:",
    			"“卖一”申请股票数量:",
    			"“卖一”报价:",
    			"“卖二”申请股票数量:",
    			"“卖二”报价:",
    			"“卖三”申请股票数量:",
    			"“卖三”报价:",
    			"“卖四”申请股票数量:",
    			"“卖四”报价:",
    			"“卖五”申请股票数量:",
    			"“卖五”报价:",
    			"日期:",
    			"时间:"
    	];
    	
    
    	//alert("开始函数");
    
         var xmlHttp;  
         if(window.XMLHttpRequest) { //如果是ie7以上浏览器，使用new new XMLHttpRequest()创建对象  
     	
             xmlHttp = new XMLHttpRequest();  
     	//	alert("xmlhttp对象创建完成"); 
         }  
         else { //如果是ie7以下使用new new XMLHttpRequest()创建对象  
             xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");  
         }  


         xmlHttp.open("POST", "JsonDate", true);  
         xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded;charset=UTF-8");

     	xmlHttp.send("stock=" + selectvalue + "&random=" + Math.random); 
     	
         xmlHttp.onreadystatechange = function () {  

      //alert(xmlHttp.readyState);
     // alert(xmlHttp.status);
  		var td=document.getElementsByTagName("td"); 
  		var th=document.getElementsByTagName("th"); 
           if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {  
        	// alert(xmlHttp.responseText);
        	 var s=xmlHttp.responseText.split(",");
        	 for(var i=0;i<td.length;i++){
        			th[i].innerHTML=test[i];
        			td[i].innerHTML=s[i];
        	 }
                     //document.getElementById("verSpan").innerHTML = "验证码正确";  
           }     
           }  
         

    } 
   
 </script>
 <style type="text/css">
 th,td{
 border: 1px red solid;
  }
 </style>
</head>
<body>


//此处应该取得从数据库查询到的值，foreach列出下拉框的选项
<form>
<select name="stock" id="stock" onchange="showInfo();" >
<option value="601006">大秦铁路</option>
<option value="601010">文峰股份</option>
<option value="601012">隆基股份</option>
<option value="601016">节能风电</option>
</select>
</form>



上证指数
<img id="min" src="">
日K线
<img id="daily" src="">
<table>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
</table>



</body>
</html>