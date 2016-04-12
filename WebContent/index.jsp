<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Financial Management System</title>
</head>
<center>
    <div class="logo"><a href="#"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
     
         <div class="login_form">    
         <h3>Financial Management System Login</h3> 
         <form action="LoginServlet">  
                
                    
                        <p>User name:
                        <input type="text" name="username" id="" size="54" />
                        </p>
                        <p>password:
                        <input type="password" name="password" id="" size="54" />
                        </p>
                    
                     <button type="submit" name="" value="" >Submit</button>
                     <button type="reset" name="" value="" >Reset</button>
                      <button type="button"  onclick="{location.href='Signup.jsp'}">Sign Up</button> 
                  
      
         </form>
         
         </div>  
    <br>
    <br>
    <div class="footer_login"> 
    	<div class="left_footer_login">By Weijian Wang, Bo Zhou, Peng Tianshu</div>
    </div>
	</center>
</body>
</html>
