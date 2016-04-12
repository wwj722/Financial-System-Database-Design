<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="src.FinancialSystem.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Application</title>
<style>
td {
	border: solid 1px;
}
</style>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<link href="//cdn.datatables.net/1.10.4/css/jquery.dataTables.min.css"
	type="text/css" rel="stylesheet" />
<script src="//cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
</head>
<body>

	<!-- <script language = "JavaScript">
function agree(){
	form.action = "ApplicationAgreeServlet";
	
}
function disagree(){
	form.action = "ApplicationDisagreeServlet";
}

</script> -->
	<p align=right>
		<a href="Administrator.jsp" class="two">Return</a> <a href="index.jsp"
			class="two">Logout</a>
	</p>

	<center>
		<h3>Applications</h3>
		<script>
			$(document).ready(function() {
				$("#app_table").dataTable();
			});
		</script>
		<form action="ApplicationAgreeServlet">
			<input type="hidden" value="${app.name}" name="app_name" /> <input
				type="hidden" value="${app.department}" name="app_department" /> <input
				type="hidden" value="${app.appliedAuthority}"
				name="app_appliedAuthority" />
			<table id="app_table">
				<thead>
					<td>id</td>
					<td>username</td>
					<td>name</td>
					<td>Department</td>
					<td>Current Authority</td>
					<td>Applied Authority</td>
				</thead>
				<tbody>
					<c:forEach items="${appList}" var="app">
						<tr>

							<td><label><input type="checkbox" value="${app.id}"
									name="app_id" />${app.id}</label></td>
							<td>${app.username}</td>
							<td>${app.name}</td>
							<td>${app.department}</td>
							<td>${app.currentAuthority}</td>
							<td>${app.appliedAuthority}</td>

						</tr>
					</c:forEach>
				</tbody>

			</table>
			<input type="submit" value="Agree" /> <input type="reset"
				name="Reset" /> <input type="submit" value="Decline" />
		</form>
	</center>
</body>
</html>