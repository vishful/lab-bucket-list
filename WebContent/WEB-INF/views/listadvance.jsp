<%@page import="modelForListAdvance.StudentDetail"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Lists</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="collection.css" />
</head>
<body>
	<h2>Lists</h2>
	<form action="/WebApp_Collections/listadvance" method="post">
		<div class="form-group">
			<div class="text">
				<label for="stringText">Enter Student Name<br> <br></label>
				<input type="text" class="form-text" id="name" placeholder="Name"
					name="name"><br> <label for="stringText">Enter
					Student Id<br> <br>
				</label> <input type="text" class="form-text" id="id" placeholder="Id"
					name="id"><br> <label for="stringText">Enter
					the Department<br> <br>
				</label> <input type="text" class="form-text" id="dept"
					placeholder="Department" name="dept"><br> <label
					for="stringText">Enter the Grade<br> <br></label> <input
					type="text" class="form-text" id="grade" placeholder="Grade"
					name="grade"><br> <input type="submit"
					value="Add Details" name="add"><br> <input
					type="submit" value="Sort By Name" name="sortname"><br>
				<br> <input type="submit" value="Sort By Id" name="sortid"><br>
				<br> <input type="submit" value="Sort By Grade"
					name="sortgrade"><br> <br> <br> <input
					type="submit" value="Start SET" name="next"><br>

				<%
					if (request.getAttribute("added") != null) {
				%>
				<p>Student Detail of ${added.getStudentName()} is added</p>
				<%
					}
				%>
				<table>
					<tr>
						<th>Student Name/</th>
						<th>Student Id/</th>
						<th>Department/</th>
						<th>Grade</th>
					</tr>

					<c:forEach var="student" items="${requestScope.studentDetail}">
						<%
							out.print("\n");
						%>
						<tr>
							<td>${student.studentName}</td>
							<td>${student.studentId}</td>
							<td>${student.department}</td>
							<td>${student.grade}</td>
						</tr>


					</c:forEach>
				</table>

			</div>
		</div>
	</form>
</body>
</html>