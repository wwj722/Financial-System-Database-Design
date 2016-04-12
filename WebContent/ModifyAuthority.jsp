<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modify Authority</title>

<style type="text/css"> 
.t_aera
{ 
 color:#458b19;
 background-color:#F6FEF6;
 clip:rect('20', '80', '20', '2');
 margin:-4px;
position:relative;
display:inline-block;
}

.text1{width:100px; height:20px;solid #85B56A;} 

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

<p>Input Employee Information To Modify the Authority</p><br><br><br>

<form action="ModifyAuthorityServlet">
<p>User Name:
<input type="text" name="username" style="border:#85B56A solid 1px"  /> 
</p>
<p>Employee ID:
<input type="text" name="employmentid" style="border:#85B56A solid 1px"  /> 
</p>
<p>Department:
<input type="text" name="department" style="border:#85B56A solid 1px" /> 
</p>

<p>Authority: 
<span style="position:auto;border:1px  margin-top:-5px"> 
  <select name="authority" class="t_aera" >
    <option value="user">User</option>
    <option value="teller system authority">Teller System Authority</option>
    <option value="checkout system authority">Checkout System Authority</option>
    <option value="financial system authority">Financial System Authority</option>
<option value="financial system accounting authority">Financial System Accounting Authority</option>
 
  </select>
 </span>
</p>
<div style="margin-left:170px; margin-top:60px; position:absolute;">

<button type="submit" name="" value="" class="css3button">Submit</button>
<button type="reset" name="" value="" class="css3button">Reset</button>
<button onclick="{location.href='Administrator.jsp'}" type="button" name="" value="" class="css3button">Cancel</button>
</div>
</form>
</body>
</html>