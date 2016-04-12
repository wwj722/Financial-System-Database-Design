<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrator</title>
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

a.two {
	padding: 12px 0;
	margin: 0;
	font-size: 1em;
	line-height: 1.5;
	font-style: italic;
}

ul {
	margin: 0 auto;
}
</style>


</head>
<body>



	<h> Administrator </h>

	<!--Logout link-->
	<!--Return, Logout link-->
	<div>
		<p align=right>
			<a href="home.jsp" class="two">Return</a> 
			<a href="index.jsp" class="two">Logout</a>
		</p>
	</div>
	<br>
	<br>
	<br>
	<div>
		<ul>
			<li style="list-style-type: none;"><a class="one"
				href="ViewApplicationServlet">View Applications</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href="ModifyAuthority.jsp">Modify Authority</a></li>
			<br>
			<li style="list-style-type: none;"><a class="one"
				href="DeleteUser.jsp">Delete User</a></li>
			<br>
		</ul>
	</div>


</body>

</body>
</html>