<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>修改密码</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- font CSS -->
<link href='http://fonts.useso.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font.css" type="text/css"/>
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script>
        (function () {
          var js;
          if (typeof JSON !== 'undefined' && 'querySelector' in document && 'addEventListener' in window) {
            js = 'js/jquery.2.0.3.min.js';
          } else {
            js = 'js/jquery.1.10.2.min.js';
          }
          document.write('<script src="' + js + '"><\/script>');
        }());
 </script>
<script src="js/modernizr.js"></script>
<script src="js/jquery.cookie.js"></script>
<script src="js/screenfull.js"></script>
		<script>
		$(function () {
			$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

			if (!screenfull.enabled) {
				return false;
			}
			$('#toggle').click(function () {
				screenfull.toggle($('#container')[0]);
			});	
		});
		</script>
<!-- tables -->
<link rel="stylesheet" type="text/css" href="css/table-style.css" />
<link rel="stylesheet" type="text/css" href="css/basictable.css" />
<script type="text/javascript" src="js/jquery.basictable.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
      $('#table').basictable();

      $('#table-breakpoint').basictable({
        breakpoint: 768
      });

      $('#table-swap-axis').basictable({
        swapAxis: true
      });

      $('#table-force-off').basictable({
        forceResponsive: false
      });

      $('#table-no-resize').basictable({
        noResize: true
      });

      $('#table-two-axis').basictable();

      $('#table-max-height').basictable({
        tableWrapper: true
      });
    });
</script>
<!-- //tables -->		
</head>
<body class="dashboard-page">

	
		<div class="main-grid">
			<!--处理进度-->
			
				
				
			<!--处理进度-->
			
			<div class="agile-grids" style="margin: 2em 10em 2em 10em;">
				<!--修改密码-->
				<div class="agile-tables">
					<div class="w3l-table-info">
						<p>
							<span style="font-size: 21px;">修改密码</span>
						</p>
					    <!--修改密码-->
    					<form action="" method="post">
     					<table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic" >
     						<tr >
       							<td width="80" align="right">用户名</td>
       							<td>
       	 							<input type="text" name="username" value="" size="40" class="inpMain" />
       							</td>
      						</tr>
      						<tr>
       							<td width="80" align="right">邮箱</td>
       							<td>
       	 							<input type="email" name="email" value="" size="40" class="inpMain" />
       							</td>
      						</tr>
      						<tr>
       							<td></td>
       							<td>
        							<!--<input type="hidden" name="token" value="b9439ae8" />-->
        							<!--<input type="hidden" name="cat_id" value="" />-->
        							<input name="submit" class="btn" type="submit" value="提交" />
       							</td>
      						</tr>
     					</table>
    				</form>
					<!--//添加成员form-->  
					</div>
				</div>
				<!--//添加收入-->
			</div>
		</div>
		<!-- footer -->
		<div class="footer">
			<p>Copyright © 1996-2017. All Rights Reserved. 版权所有    冀ICP备16013410号</p>
		</div>
		<!-- //footer -->
		<script src="js/bootstrap.js"></script>
		<script src="js/proton.js"></script>	
</body>
</html>
