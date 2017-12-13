<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<h1 style="text-align: center;">EURO CHAMPIONSHIP</h1>
<h2>MENU:</h2>
	<ul>
		<li><a href="teammanage">Team Management</a></li>
		<li><a href="#">Infomation Group</a></li>
		<li><a href="#">Infomation Charts</a></li>
		<li><a href="#">Who's Champion</a></li>
	</ul>
<h5>Team Management</h5>
<form:form method="post" action="saveTeamManage">
	<table>
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
			<td><input type="submit" value="Save Team" /></td>
		</tr>
	</table>	
</form:form>
<h4 style="text-align: center; margin-top: 100px;">Base on Spring Framework</h4>