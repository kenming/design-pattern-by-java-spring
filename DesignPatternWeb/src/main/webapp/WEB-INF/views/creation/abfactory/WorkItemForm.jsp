<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
    </head>
    <body>
        <h3>新增工作單</h3>
        <form:form method="post"  action="/mvc/abfactory/addWorkItem"  modelAttribute="workItemModel">
        	<table>
        		<tr>
	        		<th>工作事項</th>
	        		<td>
						<form:input path="itemTitle" />
	            	</td>
	            </tr>
        		<tr>
	        		<th>指派類型</th>
	        		<td>
						<form:select path="assignType" >
							<form:options items="${assignType.values}" />
						</form:select>
	            	</td>
            	</tr>
        		<tr>
	        		<th>指派者名稱</th>
	        		<td>
						<form:input path="assigneeName" />
	            	</td>
	            </tr>
            	<tr><td><br /></td></tr>
            	<tr>
					<td><input type = "submit" name = "submit" value="新增"/></td>
				</tr>
        	</table>
        </form:form>
        <h4>
        	<a href="/mvc/abfactory/listAllWorkItems" >列出所有工作單</a>
        </h4>
    </body>
</html>