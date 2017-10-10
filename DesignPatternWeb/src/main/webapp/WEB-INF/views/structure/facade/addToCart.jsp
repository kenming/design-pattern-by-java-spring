<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>購物車內的烏龜資訊</title>
</head>
<body>
<h2>購物車內的烏龜資訊</h2>
<form:form action="/mvc/facade/saveOrder" method="post">
	<table>
		<tr>
			<th>編號</th>
			<th>龜名</th>
			<th>價格</th>
			<th>購買數量</th>
		</tr>
		<c:forEach items= "${shoppingCart.cartList}"  var="turtle" varStatus="status">
			<tr>
				<td>${turtle.id}</td>
				<td>${turtle.name}</td>
				<td>${turtle.price}</td>
				<td>${turtle.quantity}</td>
			</tr>
		</c:forEach>
		<tr><td><br /></td></tr>
		<tr><td><br /></td></tr>
		<tr>
			<td><strong>總價</strong></td>
			<td><strong>${shoppingCart.totalPrice}</strong></td>
		</tr>
		<tr><td><br /></td></tr>
		<tr>
			<td><input type="button" value="Back" onclick="javascript:history.back()"/></td>
			<td><input type = "submit" name = "savebtn" value="儲存"/></td>
		</tr>
	</table>	
</form:form>
</body>
</html>