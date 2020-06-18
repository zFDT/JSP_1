<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  	<head>
	<title></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
     <div class="footer">
         <span class="span_1">Copyright &copy; onlie bookshop book
         <a href="<%=basePath %>/jsp/about us.jsp"><s:text name="aboutus"></s:text></a>
         </span>
		 <a href="locale?requset_locale=zh_CN">简体中文</a>
   		 <a href="locale?requset_locale=en_US">English</a>
		 
		 
     </div>
</body>
</html>