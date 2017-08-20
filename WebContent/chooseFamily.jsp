




<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>选择家庭</title>
        <style type="text/css">
        	*{
        		margin: 0;
        		padding: 0;
        	}
        	#div1{
        		margin: 0 auto;
        		border: 1px solid gainsboro;
        		width: 800px;
        		height: 300px;
        		margin-top: 200px;
        		z-index: 2;
        	}
        	#join{
        		margin: 0 auto;
        		border: 1px solid gainsboro;
        		width: 800px;
        		height: 300px;
        		position: absolute;
        		top: 220px;
        		left: 280px;
        		z-index: 1;
        	}
        	#tab1{
        		/*border: 1px solid red;*/
        		margin: 0 auto;
        		width: 800px;
        		height: 300px;
        	}
        	#tab2{
        		/*border: 1px solid red;*/
        		font-size: 18px;
        		margin: 0 auto;
        		margin-top: 100px;
        		width: 400px;
        		height: 100px;
        	}
        	td{
        		text-align: center;
        	}
        	#btn1,#btn2{
        		border: none;
        		width: 200px;
        		height: 50px;
        		background-color: papayawhip;
        	}
        	#btn1:hover{
        		border: 1px #14C1D7 solid;
        	}
        	#btn2:hover{
        		border: 1px #14C1D7 solid;
        	}
        	#sub{
        		width: 100px;
        		height: 30px;
        		border: none;
        		background-color: papayawhip;
        	}
        </style>
        <script type="text/javascript">
        window.onload=function(){
        	var div1=document.getElementById("div1");
        	var join=document.getElementById("join");
        	var btn1=document.getElementById("btn1");
        	var btn2=document.getElementById("btn2");
        	btn2.onclick=function(){
        		div1.style.display="none";
        		join.style.display="block";
        		
        	}
        }	
        </script>
    </head>
    <body>
    	<div id="div1">
    		<table id="tab1">
    			<tr>
    				<td>
    					<button id="btn1">创建家庭</button>
    				</td>
    				<td>
    					<button id="btn2">加入已有家庭</button>
    				</td>
    			</tr>
    		</table>
    	</div>
    	<div id="join" style="display: none;">
    		<form action="" method="post" id="form">
    			<table id="tab2">
    				<tr>
    					<td>请输入要加入的家庭ID：</td>
    					<td>
    						<input type="text" name="familyId" id="familyId" value="" />
    					</td>
    				</tr>
    				<tr>
    					<td></td>
    					<td><input type="submit" value="确认加入" id="sub"/></td>
    				</tr>
    			</table>
    		</form>
    	</div>
 	</body>
</html>