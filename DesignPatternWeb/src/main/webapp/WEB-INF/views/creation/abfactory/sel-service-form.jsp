<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
    </head>
    <body>
        <h2>Abstract Factory Pattern~</h2>
        <h3>選擇目錄服務</h3>
        <form:form method="post"  action="/mvc/abfactory/selectParticipant"  modelAttribute="participantModel">
        	<table>
        		<tr><td>
					<form:select path="participantEnum" >
						<form:options items="${participantEnum.values}" />
						
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