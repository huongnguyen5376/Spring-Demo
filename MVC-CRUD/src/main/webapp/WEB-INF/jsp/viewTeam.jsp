<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<h1>Team List</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>No</th>
		<th>Team</th>
		<th>Coach</th>
		<th>National</th>
		<th></th>
	</tr>
	<c:forEach var="team" items="${list}">
		<tr>
			<td>${team.id}</td>
			<td>${team.team}</td>
			<td>${team.coach}</td>
			<td>${team.national}</td>
			<td><a href="editteam/${team.id}">Edit</a> | 
				<a href="deleteteam/${team.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>