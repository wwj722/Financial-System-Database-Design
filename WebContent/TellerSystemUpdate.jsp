<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Insert title here</title> 
</head> 

<style type="text/css"> 
div {
width: 50%;
margin: 0px auto 0px auto}

h {font-family: Georgia, serif; font-size:30px;font-style:italic;}
.t_aera
{ 
 color:#458b19;
 background-color:#F6FEF6;
 clip:rect('20', '80', '20', '2');
 margin:-4px;
position:relative;
display:inline-block;
}


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


.hui{ 
color:#ccc; 
} 
.hei{ 
color:#000; 
} 
</style>
<p align=right>
		<a href="TellerSystem.jsp" class="two">Return</a> <a href="index.jsp"
			class="two">Logout</a>
	</p> 
<body>
<h>Teller System</h>
<br>
<p>Modify Information To Update</p><br><br>
<script language="javascript"> 
window.onload = function(){ 
var text = document.getElementById('text'); 
text.className = 'hui'; 
text.value = 'yyyy-mm-dd'; 
} 
function hui(){ 
var text = document.getElementById('text'); 
text.className = 'hei'; 
} 
</script> 
<form action="TellerSystemUpServlet">
<table><tbody><tr>


<td>Name:</td><td>
<input type="text" name="name" style="border:#85B56A solid 1px"  /> </td>
</tr>

<tr>
<td>Date:</td><td>
<input type="text" name="date" id="text" onclick="hui()" style="border:#85B56A solid 1px"  /> 
</td>
</tr>
<tr>
<td>Amount:</td><td>
<input type="text" name="amount" style="border:#85B56A solid 1px" /> 
</td>
</tr>
<tr>
<td>Department:</td><td>
<input type="text" readonly  value="${y}"/> 
</td>
</tr>
<tr>
<td>Category:</td><td>
 
<input type="text" name="category" readonly  value="${x} "  /> 
</td>
<td><input type="hidden" value="${z}" name="id" /></td>
</tr>


</tbody></table>
<div style="margin-left:170px; margin-top:60px; position:absolute;">
<button type="submit" name="" value="" class="css3button">Update</button>

</div>
</form>

</body>
</html>