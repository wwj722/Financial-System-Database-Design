<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ExamplePackage.Userinformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teller System Search</title>
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
		<a href="AccountingSystem.jsp" class="two">Return</a> <a
			href="index.jsp" class="two">Logout</a>
	</p>

	<center>
		<h3>Debt</h3>
		<script>
			$(document).ready(function() {
				$("#app_table").dataTable();
			});
		</script>
		<script>
			function fm1() {
				document.getElementById("form1").action = "AccountingsystemDeleteServlet";
				document.getElementById("form1").submit();
			}
			function fm2() {
				document.getElementById("form1").action = "AccountingsystemUpdateServlet";
				document.getElementById("form1").submit();
			}
		</script>
		<form action="" id="form1">
			<input type="hidden" value="${category}" name="category" /> <input
				type="hidden" value="${keyword}" name="keyword" /> <input
				type="hidden" value="${department}" name="department" /> <input
				type="hidden" value="${end}" name="end" /> <input type="hidden"
				value="${start}" name="start" />
			<table id="app_table">
				<thead>
					<td>id</td>
					<td>date</td>
					<td>name</td>
					<td>amount</td>
					<td>Department</td>
					<td>Employer</td>
					<td>recorder</td>
				</thead>
				<tbody>
					<c:forEach items="${tellList}" var="app">
						<tr>
							<td><label><input type="checkbox" value="${app.id}"
									name="app_id" />${app.id}</label></td>
							<td>${app.date}</td>
							<td>${app.name}</td>
							<td>${app.amount}</td>
							<td>${app.department}</td>
							<td>${app.srGotten.name}</td>
							<td>${app.recorder.name}</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
			<%
				String address;
				if (Userinformation.authority
						.equals("Financial System Accounting Authority")) {
					address = "{location.href='AccountingChoose.jsp'}";
				} else {
					address = "{location.href='errorback.jsp'}";
				}
			%>
			<%
				if (Userinformation.authority
						.equals("Financial System Accounting Authority")) {
			%>
			<input type="button" value="Delete" onclick="fm1()" />
			<%
				}
			%>
			<input type="reset" name="Reset" /> 
			<%
				if (Userinformation.authority
						.equals("Financial System Accounting Authority")) {
			%>
			<input type="button"
				value="Update" onclick="fm2()" />
				<%
				}
			%>

		</form>
	</center>
</body>
</html>