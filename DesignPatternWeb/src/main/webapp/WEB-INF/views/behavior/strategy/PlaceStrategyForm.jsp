<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
    </head>
    <body>
        <h2>Strategy Pattern Demo~</h2>
        <h3>選擇交易策略</h3>
        <form:form method="post"  action="/mvc/strategy/Execute"  modelAttribute="strategyModel">
        	<table>
        		<tr><td>
					<form:select path="strategyType" >
						<form:options items="${strategyType.values}" />
						
					</form:select>
            	</td></tr>        	
            	<tr><td><br /></td></tr>
            	<tr>
					<td><input type = "submit" name = "submit" value="查詢"/></td>
				</tr>
        	</table>
        </form:form>
    </body>
</html>