<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ExamplePackage.Userinformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body {
	text-align: center;
}

li {
	margin: 0;
	padding: 0;
	list-sytle: none
}

h {
	font-family: Georgia, serif;
	font-size: 30px;
	font-style: italic;
}

a.one:link, a.one:visited {
	display: inline-block;
	font-weight: bold;
	font-size: 14px;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	color: #FFFFFF;
	background-color: #98bf21;
	width: 190px;
	text-align: center;
	padding: 4px;
	text-decoration: none;
}

a.one:hover, a.one:active {
	background-color: #7A991A;
}

ul {
	margin: 0 auto;
}
</style>


</head>
<body>

	<%
		String address1;

		if (Userinformation.authority.equals("Administor Authority")) {
			address1 = "Administrator.jsp";
		} else {
			address1 = "errorback.jsp";
			System.out.println(Userinformation.authority);
		}
	%>
	<%
		String address2;

		if (Userinformation.authority.equals("Teller System Authority")) {
			address2 = "TellerSystem.jsp";
		} else {
			address2 = "errorback.jsp";
			System.out.println(Userinformation.authority);
		}
	%>
	<%
		String address3;

		if (Userinformation.authority.equals("Financial System Accounting Authority")||(Userinformation.authority.equals("Financial System Authority"))) {
			address3 = "AccountingSystem.jsp";
		} else {
			address3 = "errorback.jsp";
			System.out.println(Userinformation.authority);
		}
	%>
	<%
		String address4;

		if (Userinformation.authority.equals("Checkout System Authority")) {
			address4 = "CheckerSystem.jsp";
		} else {
			address4 = "errorback.jsp";
			System.out.println(Userinformation.authority);
		}
	%>


	<h> Financial Management </h>






	<!--Logout link-->

	<p align=right>
		<a href="index.jsp">Logout</a>
	</p>

	<!--  
<div align="right">
<form action="AdministratorServlet">
    <input type="submit" value="Administrator" />
</form>
</div>
-->

	<div>
		<ul>




			<li style="list-style-type: none;"><a class="one"
				href="Userinformation.jsp">User Information</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href=<%=address1%>>Administrator</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href=<%=address2%>>Teller System</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href=<%=address3%>>Accounting System</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href=<%=address4%>>Checker System</a></li>
			<br>
		</ul>
	</div>



</body>
</html>