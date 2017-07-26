<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

用户列表：
<table>
	<tr><td>序号</td><td>姓名</td><td>年龄</td><td>地址</td></tr>
	<c:forEach items="${userList}" var="u">
	<tr>
		<td>${u.id}</td>
		<td>${u.userName}</td>
		<td>${u.age}</td>
		<td>${u.address}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>