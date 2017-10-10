<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
		<h2>Proxy Pattern</h2>
		<h3>烏龜認證資訊查詢表單</h3>
        <form:form method="post"  action="/mvc/proxy/Identify"  modelAttribute="turtleInfo">
        	<table>
        		<tr>
	                <td><form:label path="品種">品種：</form:label></td>
	                <td><form:select path="品種">
		                        <form:option value="NONE" label="請選擇..." />
		                        <form:options items="${varietyList}" />
	                    	</form:select></td>
            	</tr>
            	<tr>
                	<td><form:label path="序號">請輸入序號:</form:label></td>
                	<td><form:input path="序號" /></td>
            	</tr>
            	<tr><td><br /></td></tr>
            	<tr>
					<td><input type = "submit" name = "submit" value="查詢"/></td>
				</tr>
        	</table>
        </form:form>
    </body>
</html>