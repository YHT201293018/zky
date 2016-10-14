<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<title>登录</title>
<link rel="shortcut icon" href="resources/img/fy_logo.png" />
<link type="text/css" rel="stylesheet" href="resources/css/common.css"
	media="screen" />
<link type="text/css" rel="stylesheet" href="resources/css/dzda.css" />
<link type="text/css" rel="stylesheet" href="resources/css/login.css" />


</head>
<body>
	<div class="body_wrapper">
		<div class="header">
			<div class="fy_logo"></div>
		</div>
		<div class="login_wrapper">
			<div class="form_wrapper">
				<form action="login.do" class="login_form" method="post">
					<div class="username_wrapper">
						<span class="user_logo" title="用户名"></span><input id="username" type="text"
							class="login_input" name="username" value="用户名"
							onfocus="javascript:if(this.value=='用户名') this.value='';"
							onblur="javascript:if(this.value=='') this.value='用户名';">
					</div>
					<div class="pass_wrapper">
						<span class="pass_logo" title="密码"></span><input id="password" type="password"
							class="login_input" name="password" value="">
					</div>
					<div class="login_btn_wrapper">
						<input type="submit" value="登&nbsp;&nbsp;&nbsp;&nbsp;录">
					</div>
					
				</form>
			</div>
		</div>
	</div>
	<table style="display:none"><tr><td valign="top">	
	
	<OBJECT Name="GT2ICROCX" classid="CLSID:5A381625-B14C-4ACD-BD3B-8D2BA0B5C7DB" style="display:none" id="identity" CODEBASE="XX_IdrOcx.CAB#version=2,1,0,0"  VIEWASTEXT></OBJECT>	
	<script language="javascript">
		function showvalue()
		{		
			var ret = GT2ICROCX.ReadCard();
			if(ret==0){
			//		var born=GT2ICROCX.Born;
					document.getElementById("username").value=GT2ICROCX.Name;
					document.getElementById("password").value=GT2ICROCX.CardNo;
			//		myform.zjlb.value="A";
				}
				else
				{
					alert("读卡错误！");
				}	
		}					
	</script>
</td></tr></table>
	<script type="text/javascript">
		function showTemp(a){
			if(a=="0"){document.getElementById("ssfz").style.visibility="hidden";}
			if(a=="1"){document.getElementById("ssfz").style.visibility="visible";}
		}
	</script>
	<script type="text/javascript" src="resources/js/jquery.js" charset="UTF-8"></script>
	<script type="text/javascript" src="resources/js/browser.js" charset="UTF-8"></script>
</body>
</html>
