<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  	<head>
    <title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<q:import url="head.jsp"/>
	<div id="right" align="left">
		<div style="padding-right: 3%; padding-left: 5%; width: 90%; height: 100%;">
			<div align="center">
				<div id="title" align="left">
					<s:if test="carbooks.size()>0">
					<table style="width:100%;border:1;">
						<tr style="text-align: center">
							<td width="100px"><s:text name="picture_book"/></td>
								<td width="180px"><s:text name="name_book"/></td>
									<td width="180px"><s:text name="author_book"/></td>
										<td width="90px"><s:text name="price_book"/></td>
										<td colspan="2" width="150px"><s:text name="operation"/></td>
						</tr>
						<s:iterator value="carbooks" status="carbook">
							<s:if test="#userStatus.odd == true ">odd</s:if>			
							<tr style="text-align: center">
							<td width="100px" ><img src="<s:property value="picture"/>" alt="book" /></td>
							<td width="180px"><s:property value="name_ch" /></td>
							<td width="180px"><s:property value="author_ch" /></td>
							<td width="90px"><span>＄</span><s:property value="price" /></td>
							<td colspan="2" width="150px"><a href="cardel.action?username=<s:property value="username"/>&bookid=<s:property value="bookid" />">删除</a></td>
							</tr>
						</s:iterator>
						</table>
				</s:if><s:else><div><s:text name="not_cart"/></div></s:else>
					</div>
					</div>
				</div>
			</div>
	<q:import url="footer.jsp"/>
</body>
</html>