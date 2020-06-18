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
    <title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/main.css" />
<script language =javascript > 
var curIndex=0; 
//时间间隔 单位毫秒 
var timeInterval=5000; 
var arr=new Array(); 
arr[0]="M1.jpg"; 
arr[1]="M2.jpg"; 
setInterval(changeImg,timeInterval); 
function changeImg() 
{ 
var obj=document.getElementById("showpic"); 
if (curIndex==arr.length-1) 
{ 
curIndex=0; 
} 
else 
{ 
curIndex+=1; 
} 
obj.src="img/"+arr[curIndex]; 
} 
</script> 
</head>

<body>
<q:import url="head.jsp"/>
<div class="login-main">
	<div class="main-mian">	
		<div class="top_banner">
  			<div class="top_logo"><a href="/JSP/main.jsp"><img src="img/top_logo.jpg" alt="A BOOK APART LOGO" /></a></div>
  			<div class="top_shop_cur">
  			<a href="carshow?username=<s:property value="username"/>"><img src="img/top_shop_cur.jpg" alt="shopping car" /></a>
  			</div>
  		</div>
	  </div>
	<span class="index_img">
	<img src="img/M1.jpg" id="showpic" /> 
    </span> 
   <p class="index_hr"></p> 
   <s:if test="books.size()>0">
   <div class="content">
   <h1 class="h1_book_title">Also from A Book Apart--</h1>
   <div class="content">
   <ul>
	<s:iterator value="books" status="book">
	<li class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
	         <dl>
         	<dd style="text-align: center;">
         	<img src="<s:property value="picture"/>" alt="book" /> 
         	<p class="book_title"><s:property value="name_en" /></p>
         	<p class="book_title"><s:property value="author_en" /></p>
         	<p class="book_inline"><span>＄</span><s:property value="price" /></p>
         	<div style="width:250px;text-align: center;">
         	<a class="book_buy" href="addcar.action?username=<s:property value="username"/>&bookid=<s:property value="id" />"target="_blank">BUY</a>
         	</div>
         	</dd>
         	</dl>
         		</li>
		</s:iterator>
	</ul>
	</div>
	</div>
	  		</s:if>
	</div>
	



	<q:import url="footer.jsp"/>
</body>
</html>