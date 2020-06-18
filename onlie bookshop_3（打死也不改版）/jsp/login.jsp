<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  	<head>
  	 <base href="<%=basePath%>">
    <title><s:text name="login.title"></s:text></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
	function hideURLbar(){ window.scrollTo(0,1); } </script>
	<link type="text/css" rel="stylesheet" href="css/main.css" />
	<link type="text/css" rel="stylesheet" href="css/flexslider.css" />
	
	</head>
<body>
<q:import url="head.jsp"/>

<div class="headline">
	<h1><s:text name="onliebookshop"/></h1>
</div>

<div class="login-main">
<div class="login-left-side">
<div class="flexslider">
  <ul class="slides">
    <li>
      <img src="img/g5.jpg" alt="image"/>
    </li>
    <li>
      <img src="img/g2.jpg" alt="image"/>
    </li>
    <li>
      <img src="img/g3.jpg" alt="image"/>
    </li>
    <li>
      <img src="img/g4.jpg" alt="image"/>
    </li>
	<li>
      <img src="img/g1.jpg" alt="image"/>
    </li>
  </ul>
</div>
</div>
<div class="login-rigt-side">
<tr><td colspan="2"><FONT color="red"><s:actionerror/></FONT></td><!--显示错误信息 --></tr> 
	<s:head/>
	<s:form action="login" method="post">
		<s:textfield name="username" key="username" />
		<s:password name="password" key="password" />
		<s:submit key="login.submit"/>
	</s:form>
</div>
</div>


	<q:import url="footer.jsp"/>
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script defer src="js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	</script>
</body>
</html>