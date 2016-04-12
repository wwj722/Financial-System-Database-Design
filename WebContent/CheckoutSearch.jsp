<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
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
		<a href="CheckerSystem.jsp" class="two">Return</a> <a
			href="index.jsp" class="two">Logout</a>
	</p>

	<center>
		<h3>Checkout System</h3>
		<script>
			$(document).ready(function() {
				$("#app1_table").dataTable();
			});
			$(document).ready(function() {
				$("#app2_table").dataTable();
			});
		</script>
		<script>
			function fm1() {
				document.getElementById("form1").action = "CorrectServlet";
				document.getElementById("form1").submit();
			}
			function fm2() {
				document.getElementById("form1").action = "FalseServlet";
				document.getElementById("form1").submit();
			}
		</script>
		<form action="" id="form1">
			<input type="hidden" value="${category}" name="category" /> <input
				type="hidden" value="${keyword}" name="keyword" /> <input
				type="hidden" value="${department}" name="department" /> <input
				type="hidden" value="${end}" name="end" /> <input type="hidden"
				value="${start}" name="start" />
			<table id="app1_table">
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
					<c:forEach items="${tellList1}" var="app1">
						<tr>
							<td><label><input type="checkbox" value="${app1.id}"
									name="app1_id" />${app1.id}</label></td>
							<td>${app1.date}</td>
							<td>${app1.name}</td>
							<td>${app1.amount}</td>
							<td>${app1.department}</td>
							<td>${app1.gotten.name}</td>
							<td>${app1.recorder.name}</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
			
			
			<table id="app2_table">
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
					<c:forEach items="${tellList2}" var="app2">
						<tr>
							<td><label><input type="checkbox" value="${app2.id}"
									name="app2_id" />${app2.id}</label></td>
							<td>${app2.date}</td>
							<td>${app2.name}</td>
							<td>${app2.amount}</td>
							<td>${app2.department}</td>
							<td>${app2.srGotten.name}</td>
							<td>${app2.recorder.name}</td>
								
					</c:forEach>
				</tbody>

			</table>
			
			
			<input type="submit" value="Correct" onclick="fm1()" />
			
			<input type="reset" name="Reset" /> 
		
			<input type="submit"
				value="Flase" onclick="fm2()" />
			

		</form>
	</center>
</body>
</html>