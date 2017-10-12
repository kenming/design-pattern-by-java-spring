<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
    </head>
    <body>
        <h2>Memento Pattern~</h2>
        <h3>複合彩投注表單</h3>
        <form:form  method="post" modelAttribute="lottoModel" action="/mvc/memento/lottoForm" >
        	<table>
        		<tr>
	        		<th>彩券號碼</th>
	        		<td>
						<form:input path="彩券號碼" />
	            	</td>
	            </tr>
        		<tr>
	        		<th>成語字組</th>
	        		<td>
						<form:select path="成語字謎" >
							<form:option value="NONE" label="--- Select ---" />
							<form:options items="${idiomList}" />							
						</form:select>
	            	</td>
            	</tr>   	
            	<tr><td><br /></td></tr>
            	<tr>
					<td><input type = "submit" name="autoselect" value="自動選號" /></td>
					<td><input type = "submit" name="saveLotto" value="暫存本組複合彩" /></td>
					<td><input type = "submit" name="restoreLotto" value="還原所選複合彩" /></td>
				</tr>
        	</table>
        </form:form>
    </body>
</html>