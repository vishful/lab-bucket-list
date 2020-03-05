
<%@page import="model.TouristPlace"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Lists</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="./assets/list.css" />
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/list" method="post">
		<div class="form-group">
			<div class="list">
				<label id="name-id" for="stringText">Name</label> 
				<input type="text" class="form-text" id="name"	placeholder="Name" name="name">
				<label id="travel-id" for="destination">Travel Destination</label> 
				<input type="text" class="form-text" id="destination" placeholder="Place" name="travel">
				<label id="rank-id" for="rank">Rank</label> 
				<input type="text" class="form-text" id="rank" placeholder="Rank" name="rank">
			  <button class="button" type="submit" value="ADDITEM" name="add">ADD TO BUCKET LIST</button> 
			<!-- <input	type="submit" value="REMOVE" name="remove">
			 <input type="submit" value="VEIW NAMES" name="view">
			 <input type="submit" value="ASCENDING" name="ascending">
			 <input type="submit" value="DESCENDING" name="descending"> 
			 <input type="submit" value="CLEAR" name="clear">
			 <input	type="submit" value="GO NEXT" name="next"><br> -->
			
	


			</div>
		</div>
	</form>
<div class="output-border">
	<div class="output">
	<p id="bucket-list">Amy's Bucket list</p>	
	</div>
	
			<table class="table-bordered">
			<tbody>
					
					<c:forEach var="bucket" items="${bucketListadd}">

						<tr>
						
							<td><c:out value="${bucket.getName()}" /></td>
							<td><c:out value="${bucket.getDestination()}" /></td>
							<td><c:out value="${bucket.getRank()}" /></td>
						
	</tr>
					</c:forEach>

				</tbody>

			</table>
</div>
</body>
</html>