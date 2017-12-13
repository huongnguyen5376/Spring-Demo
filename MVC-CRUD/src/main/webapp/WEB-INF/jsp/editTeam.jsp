<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Team</h1>
<form:form method="POST" action="/MVC-CRUD/editsave">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>	
		<tr>
			<td>Team</td>
			<td><form:input path="team" /></td>
		</tr>
		<tr>
			<td>Coach</td>
			<td><form:input path="coach" /></td>
		</tr>
		<tr>
			<td>National</td>
			<td><form:input path="national" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Edit Team" /></td>
		</tr>
	</table>
</form:form>
