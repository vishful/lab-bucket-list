<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Set</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="collection.css" />
</head>
<body>
	<h2 class="set">Set Implementation</h2>
	<form action="/WebApp_Collections/set" method="post">
		<div class="form-group">
			<div class="text">
				<div class="textfield">
					<label for="stringText">Enter the branch<br>
					<br></label>
				</div>
				<input type="text" class="form-text" id="string"
					placeholder="Department" name="name"><br>
				<br> <input type="submit" value="ADD ITEM" name="add">
				<input type="submit" value="REMOVE ITEM" name="remove"><br>
				<br> <input type="submit" value="CLEAR ALL" name="clear">
			</div>
			<div class="form-group">
				<div>
					<select name="options" class="options">
						<option value="select">VIEW BY</option>
						<option value="HashSet">HashSet</option>
						<option value="LinkedHashSet">LinkedHashSet</option>
						<option value="TreeSet">TreeSet</option>

					</select>
				</div>
				<br>
				<br> <input type="submit" value="VIEW" name="view"><br>
				<br> <input type="submit" value="Start MAP" name="next">
			</div>
		</div>

		<% if (request.getAttribute("studentListadd") != null) { %>
		<p>Student Name of ${studentListadd} is added</p>
		<% } %>

		<% if (request.getAttribute("studentListremove") != null) { %>
		<p>Student Name of ${studentListremove} is removed</p>
		<% } %>

		<% if (request.getAttribute("studentListclear") != null) { %>
		<p>${studentListclear}</p>
		<% } %>

		<c:forEach var="student" items="${requestScope.studentList}">
			<% out.print("\n"); %>
			<c:out value="${student}" />
		</c:forEach>

	</form>
</body>
</html>