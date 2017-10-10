<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h3>歡迎購買長壽又可愛的烏龜~</h3>
        <form:form method="post"  action="/mvc/facade/addToCart"  modelAttribute="shopper">
             <table>
                <tr>
                    <th>編號</th>
                    <th>龜名</th>
                    <th>價格</th>
                    <th>購買數量</th>
                </tr>
                <c:forEach items= "${shopper.shoppingList}"  var="turtle" varStatus="status">
				<tr>
					<td><form:hidden path="shoppingList[${status.index}].id" value="${turtle.id}"/>${turtle.id}</td>
					<td><form:hidden path="shoppingList[${status.index}].name" value="${turtle.name}"/>${turtle.name}</td>
					<td><form:hidden path="shoppingList[${status.index}].price" value="${turtle.price}"/>${turtle.price}</td>
					<td><form:input path="shoppingList[${status.index}].quantity" type="text"/></td>
					<!-- Here you are setting the data in the appropriate index which will be caught in the controller -->
				</tr>
				</c:forEach>
            </table>
            <br/>
			<input type="submit"  value="放入購物車" />
     	</form:form>
    </body>
</html>