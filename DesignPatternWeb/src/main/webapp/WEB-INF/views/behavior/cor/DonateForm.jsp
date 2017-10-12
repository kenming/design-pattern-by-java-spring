<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
    </head>
    <body>
        <h2>Chain of Responsibility Pattern~</h2>
        <h3>政治獻金捐獻表單</h3>
        <form:form method="post"  action="/mvc/cor/Execute"  modelAttribute="donateModel">
        	<table>
        		<tr>
	        		<th>捐款人/團體</th>
	        		<td>
						<form:input path="name" />
	            	</td>
	            </tr>
        		<tr>
	        		<th>捐獻類型</th>
	        		<td>
						<form:select path="type" >
							<form:options items="${type.values}" />							
						</form:select>
	            	</td>
            	</tr>
	       		<tr>
	        		<th>捐款金額</th>
	        		<td>
						<form:input path="money" />
	            	</td>
	            </tr>
	       		<tr>
	        		<th>備註&emsp;：</th>
	        		<td>
						<form:textarea path="ext_info" rows="4" cols="20" />
	            	</td>
	            </tr>     	
            	<tr><td><br /></td></tr>
            	<tr>
					<td><input type = "submit" name = "submit" value="查詢"/></td>
				</tr>
        	</table>
        </form:form>
    </body>
</html>