<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
		</tr>
		<c:forEach var="s" items="${list}">
		<tr>
			<td><c:out value="${s.sid}"/></td>
			<td><c:out value="${s.sname}"/></td>
		</tr>		
		</c:forEach>
	</table>
</body>
</html>