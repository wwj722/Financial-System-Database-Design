<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="ExamplePackage.Userinformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<style type="text/css">
<!--
Search Box style -->body {
	font: normal 200% 'Arial', 'Helvetica', 'Verdana', sans-serif;
	color: #333;
}

h {
	font-family: Georgia, serif;
	padding: 12px 0;
	margin: 0;
	font-size: 2em;
	line-height: 1.5;
	font-style: italic;
}

p {
	padding: 12px 0;
	margin: 0;
	font-size: 1em;
	line-height: 1.5;
}

a.one {
	padding: 12px 0;
	margin: 0;
	font-size: 1em;
	line-height: 1.5;
	font-style: italic;
}

form {
	margin: 0;
}

#search_box {
	display: inline-block;
	text-align: center;
	width: 201px;
	height: 31px;
	background: url(http://files.jb51.net/demoimg/200912/bg_search_box.gif);
}

#search_box #s {
	float: left;
	padding: 0;
	margin: 6px 0 0 6px;
	border: 0;
	width: 159px;
	background: none;
	font-size: .8em;
	display: inline-block;
}

#search_box #go {
	float: right;
	margin: 3px 4px 0 0;
}

button.css3button {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
	color: #ffffff;
	padding: 10px 20px;
	background: -moz-linear-gradient(top, #00ff00 0%, #108509 50%, #259400 50%, #72ff59);
	background: -webkit-gradient(linear, left top, left bottom, from(#00ff00),
		color-stop(0.50, #108509), color-stop(0.50, #259400), to(#72ff59));
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px;
	border: 1px solid #3cc920;
	-moz-box-shadow: 0px 1px 3px rgba(043, 087, 007, 0.5), inset 0px 0px 2px
		rgba(005, 079, 013, 1);
	-webkit-box-shadow: 0px 1px 3px rgba(043, 087, 007, 0.5), inset 0px 0px
		2px rgba(005, 079, 013, 1);
	box-shadow: 0px 1px 3px rgba(043, 087, 007, 0.5), inset 0px 0px 2px
		rgba(005, 079, 013, 1);
	text-shadow: 0px -1px 0px rgba(223, 230, 018, 0.2), 0px 1px 0px
		rgba(166, 090, 010, 0.4);
}

.hui {
	color: #ccc;
}

.hei {
	color: #000;
}

.dbox {
	position: fixed;
	left: 608px;
	bottom: 420px;
}

.dst {
	position: fixed;
	left: 610px;
	bottom: 300px;
}

.ded {
	position: fixed;
	left: 610px;
	bottom: 240px;
}

.dbu {
	position: fixed;
	left: 480px;
	bottom: 150px;
}

.dca {
	position: fixed;
	left: 608px;
	bottom: 340px;
}

.dde {
	position: fixed;
	left: 608px;
	bottom: 380px;
}

.t_aera {
	color: #458b19;
	background-color: #F6FEF6;
	clip: rect('20', '80', '20', '2');
	margin: -4px;
	position: relative;
	display: inline-block;
}
</style>


<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
	$(document).ready(function() {
		$("#start_datepicker").datepicker({
			changeMonth : true,
			changeYear : true
		});
		$("#end_datepicker").datepicker({
			changeMonth : true,
			changeYear : true
		});
	});
</script>


</head>



<body>
	<center>
		<h> Accounting System </h>
	</center>




	<!--Return, Logout link-->
	<div>
		<p align=right>
			<a href="home.jsp" class="one">Return</a> <a href="index.jsp"
				class="one">Logout</a>
		</p>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form action="AccountingSystemSearchServlet" method="get">
		<div class="dca">
			<table>
				<tbody>
					<tr>
						<td>Category:</td>
						<td><span style="position: auto; border: 1px margin-top:-5px">
								<select name="category" class="t_aera">
									<option value="SalaryRecords">Salary Records</option>
									<option value="OtherRecords">Other Records</option>
									<option value="DebtRecords">Debt Records</option>
							</select>
						</span></td>
					</tr>

				</tbody>
			</table>
		</div>
		<div class="dde">
			<table>
				<tr>
					<td>Department:</td>
					<td><span style="position: auto; border: 1px margin-top:-5px">
							<select name="department" class="t_aera">
								<option value="Business Department">Business Department</option>
								<option value="Sales Department">Sales Department</option>
								<option value="HR Department">HR Department</option>
								<option value="Marketing Department">Marketing
									Department</option>
								<option value="Financial Department">Financial
									Department</option>
								<option value="Checker Department">Checker Department</option>
								<option value="Teller Department">Teller Department</option>
								<option value="Service Department">Service Department</option>

						</select>
					</span></td>
				</tr>
			</table>


		</div>

		<div class="dbox">
			<table>
				<tr>
					<td><input type="text" id="text" placeholder="keyword"
						name="keyword" /></td>
				</tr>
			</table>
		</div>



		<div class="dst">

			<p>
				Start Date: <input name="start" type="text" id="start_datepicker">
			</p>
		</div>
		<br>






		<div class="ded">

			<p>
				End Date: <input name="end" type="text" id="end_datepicker" class="">
			</p>
			<button type="submit" name="" value="" class="css3button">Search</button>
		</div>
		<br>
	</form>

	<!-- button style -->
	<div class="dbu"
		style="margin-left: 170px; margin-top: 60px; position: absolute;">

<% String address;
if (Userinformation.authority.equals("Financial System Accounting Authority")){
	address = "{location.href='AccountingChoose.jsp'}";
}
else {
	address = "{location.href='errorback.jsp'}";
}	
%>

		<button onclick=<%=address %> type="button"
			name="" value="" class="css3button">Create New Records</button>

	</div>


</body>
</html>
