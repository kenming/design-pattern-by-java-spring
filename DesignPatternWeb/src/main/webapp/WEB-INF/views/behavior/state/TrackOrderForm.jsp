<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h2>State Pattern Demo~</h2>
        <h3>追蹤訂單資訊</h3>
        <form:form method="post"  action="/mvc/state/stamp"  modelAttribute="shopper">
        	<h4>處理訊息</h4>
        	<p>${procMessage}</p>
        	<br/><br/>
			<input type="submit"  value="簽署" />
        </form:form>
    </body>
</html>