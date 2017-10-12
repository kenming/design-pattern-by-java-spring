<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
    	<h2>Adapter Pattern</h2>
        <h3>查詢烏龜清單~</h3>
             <table>
                <tr>
                    <th>編號</th>
                    <th>龜名</th>
                    <th>價格</th>
                    <th>購買數量</th>
                </tr>
					 <c:forEach items= "${TurtleList}"  var="turtle" varStatus="status">
				<tr>
					<td>${turtle.id}</td>
					<td>${turtle.name}</td>
					<td>${turtle.price}</td>
					<td>${turtle.quantity}</td>
					<!-- Here you are setting the data in the appropriate index which will be caught in the controller -->
				</tr>
				</c:forEach>
			</table>
	</body>
</html>