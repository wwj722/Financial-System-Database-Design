<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<style>
body {

text-align: center;

}
li{margin:0; padding:0; list-sytle:none}

h {font-family: Georgia, serif; font-size:30px;font-style:italic;}
a.one:link,a.one:visited
{

display:inline-block;
font-weight:bold;
font-size:14px;
font-family:Verdana, Arial, Helvetica, sans-serif;
color:#FFFFFF;
background-color:#98bf21;
width:190px;
text-align:center;
padding:4px;
text-decoration:none;
}

a.one:hover,a.one:active
{
background-color:#7A991A;
}

a.two { 
padding: 12px 0; 
margin: 0; 
font-size: 1em; 
line-height: 1.5; 
font-style:italic;
} 

ul{margin:0 auto;}


button.css3button {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
	color: #ffffff;
	padding: 10px 20px;
	background: -moz-linear-gradient(
		top,
		#00ff00 0%,
		#108509 50%,
		#259400 50%,
		#72ff59);
	background: -webkit-gradient(
		linear, left top, left bottom,
		from(#00ff00),
		color-stop(0.50, #108509),
		color-stop(0.50, #259400),
		to(#72ff59));
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px;
	border: 1px solid #3cc920;
	-moz-box-shadow:
		0px 1px 3px rgba(043,087,007,0.5),
		inset 0px 0px 2px rgba(005,079,013,1);
	-webkit-box-shadow:
		0px 1px 3px rgba(043,087,007,0.5),
		inset 0px 0px 2px rgba(005,079,013,1);
	box-shadow:
		0px 1px 3px rgba(043,087,007,0.5),
		inset 0px 0px 2px rgba(005,079,013,1);
	text-shadow:
		0px -1px 0px rgba(223,230,018,0.2),
		0px 1px 0px rgba(166,090,010,0.4);
}


</style> 


</head>
<body>



<h> Checker System </h>

<!--Logout link-->
<!--Return, Logout link-->
<div> 
<p align=right >
<a  href="home.jsp" class="two" >Return</a>

<a  href="index.jsp" class="two" >Logout</a>
</p>
</div> 
<br><br><br><br>

<!-- button style -->
<div>

	<button type="button"  onclick="{location.href='CheckedSearchServlet'}" name="" value="" class="css3button">Checked Records</button>

</div> 
<br>
<!-- button style -->
<div>

	<button type="button"  onclick="{location.href='FalseSearchServlet'}" name="" value="" class="css3button">False Connection</button>

</div> 
<br>

<!-- button style -->
<div>

	<button type="button" onclick="{location.href='CheckSystemCreate.jsp'}" name="" value="" class="css3button">Create New Connection</button>

</div> 


</body>
</html>
