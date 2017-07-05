<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	 <tr>
		        <td>id</td>
		        <td>name</td>
	</tr>
	<#list userList as user>
		    <tr>
		        <td>${user.id}</td>
		        <td>r${user.name}</td>
		    </tr>
	</#list>
</table>
</body>
</html>