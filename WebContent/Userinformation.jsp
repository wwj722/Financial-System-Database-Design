<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="ExamplePackage.Userinformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css"> 
a.one { 
padding: 12px 0; 
margin: 0; 
font-size: 1em; 
line-height: 1.5; 
font-style:italic;
} 
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
<center>
<h4>User Information</h4>
<div> 
<p align=right >
<a  href="home.jsp" class="one" >Return</a>

<a  href="index.jsp" class="one"  >Logout</a>
</p>
</div> 
<div>
<table   style="border:#85B56A solid 1px" >
       <tr>
                <td>Name:</td>
                 <td><%=Userinformation.name %></td>
       </tr>
       <tr>
                <td>EmploymentID:</td>
                 <td><%=Userinformation.id %></td>
       </tr>
       <tr>
                <td>User Name:</td>
                 <td><%=Userinformation.username %></td>
       </tr>
       <tr>
                <td>Department:</td>
                 <td><%=Userinformation.department %></td>
       </tr>
       <tr>
                <td>Current Authority:</td>
                 <td><%=Userinformation.authority %></td>
       </tr>
       </table>
       <br>
       </div>
       
<form action="AuthorityApplicationServlet">
<p>Apply Authority: 
<span style="position:auto;border:1px  margin-top:-5px"> 
  <select name="authorityapp" class="t_aera" >
   
    <option value="teller system authority">Teller System Authority</option>
    <option value="checkout system authority">Checkout System Authority</option>
    <option value="financial system authority">Financial System Authority</option>
<option value="financial sysytem accounting authority">Financial System Accounting Authority</option>
 
  </select>
 </span>
</p>
<div style="margin-center; margin-top:60px; position:relative;">
<button type="submit" name="" value="" class="css3button">Submit</button>
<button type="button" onclick="{location.href='home.jsp'}" name="" value="" class="css3button">Cancel</button>
</div>
</form>
</center>
</body>
</html>