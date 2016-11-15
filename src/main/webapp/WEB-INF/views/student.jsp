<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Student Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>

<c:url var="addAction" value="/student/add" ></c:url>
<c:url var="updateAction" value="/update" ></c:url>
<h3>Students List</h3>
<%-- <c:if test="${!empty listStudents}"> --%>
	<table class="tg">
	<tr>
		<th width="80">Student ID</th>
		<th width="120">Reference</th>
		<th width="120">Firstname</th>
		<th width="60">LastName</th>
		<th width="60">Birthday</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listStudents}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.reference}</td>
			<td>${student.nom}</td>
			<td>${student.prenom}</td>
			<td>${student.dateNaissance}</td>
			<td><a href="<c:url value='/edit/${student.id}' />" >Edit<a></a></td>
			<td>
			</td>
			
		</tr>
	</c:forEach>
	</table>
<%-- </c:if> --%>
</body>
</html>