<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Module List</title>
		<style type="text/css">
			.error {
				color: red;
			}
		
			td.label {
				text-align: right;
			}
			table, th, td {
  				border: 1px solid black;
			}
			#list {
				font-size: 300%;
				margin-left: 600px;
			}
			#login {
					float: right;
			}
		</style>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
							<input name="direct" type="submit" value=Home Page" />
		<div id = "login">
			<form action="${pageContext.servletContext.contextPath}/homePage" method="get">
				<table>
					<tr>
						<td class="label">Username:</td>
						<td><input type="text" name="first" size="12" value="${login.username}" /></td>
					</tr>
					<tr>
						<td class="label">Password:</td>
						<td><input type="text" name="second" size="12" value="${login.password}" /></td>
					</tr>
				</table>
				<input type="Submit" name="submit" value="Login">
			</form>
		</div>
		</form>
		<div id = "list">
			<table>
				<th>
					Module List
				</th>
				<th>
					Status
				</th>
				<tr>
					<td>
						<form action="${pageContext.servletContext.contextPath}/moduleData" method="get">
							<input name="direct" type="submit" value="Module 1" />
						</form>
					</td>
					<td>
						Active
					</td>
				</tr>
				<tr>
					<td>
						<form action="${pageContext.servletContext.contextPath}/moduleData" method="get">
							<input name="direct" type="submit" value="Module 2" />
						</form>
					</td>
					<td>
						Active
					</td>
				</tr>
				<tr>
					<td>
						<form action="${pageContext.servletContext.contextPath}/moduleData" method="get">
							<input name="direct" type="submit" value="Module 3" />
						</form>
					</td>
					<td>
						Active
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>