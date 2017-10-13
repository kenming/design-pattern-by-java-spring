<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
    <h3>列出所有工作單</h3>
    	<c:forEach var="listItem" items="${workitemList}" varStatus="theCount" >
   	     	<table>
       			<tr>
       				<th>編號</th>
       				<th>項目名稱</th>
       				<th>指派類型</th>
       				<th>指派者</th>
       			</tr>
       			<tr>
       				<td>${listItem.ID}</td>
       				<td>${listItem.itemTitle}</td>
       				<td>${listItem.assignType}</td>
       				<td>${listItem.assigneeName}</td>
       				<td><a href="/mvc/abfactory/process/${listItem.ID}">處理</a></td>
       			</tr>
       		</table>
		</c:forEach>		
	</body>
</html>