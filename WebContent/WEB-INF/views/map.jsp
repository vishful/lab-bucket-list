<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Map</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="collection.css" />
</head>
<body>
	<h2 class="map">Map Implementation</h2>

	<form action="/WebApp_Collections/map" method="post">
		<div class="form-group">
			<div class="text">
				<label for="stringText">Enter Student Id<br>
				<br></label> <input type="text" class="form-text" id="string1"
					placeholder="Id" name="id"><br>
				<br> <label for="stringText">Enter Student Name<br>
				<br></label> <input type="text" class="form-text" id="string2"
					placeholder="Name" name="name"><br>
				<br> <input type="submit" value="ADD ITEM" name="add">
				<br>
				<br> <input type="submit" value="CLEAR ALL" name="clear">

				<div class="form-group">
					<div>
						<select name="options" class="options">
							<option value="select">VIEW BY</option>
							<option value="HashMap">HashMap</option>
							<option value="LinkedHashMap">LinkedHashMap</option>
							<option value="TreeMap">TreeMap</option>
						</select>
					</div>
					<br>
					<br> <input type="submit" value="VIEW" name="view"> <input
						type="submit" value="END" name="end">

					<% if (request.getAttribute("studentListadd") != null) { %>
					<p>Student Name of ${studentListadd} is added</p>
					<% } %>

					<% if (request.getAttribute("studentListclear") != null) { %>
					<p>${studentListclear}</p>
					<% } %>

					<c:forEach var="student" items="${requestScope.studentList}">
						<% out.print("\n"); %>
						<c:out value="${student}" />
					</c:forEach>

				</div>
			</div>
		</div>
	</form>
</body>
</html>