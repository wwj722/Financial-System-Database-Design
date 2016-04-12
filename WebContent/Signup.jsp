<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
please sign up here!
</center>
<form action="signupServlet">  
             
                 <dl>
                        <dt><label for="id">Your employment ID:</label></dt>
                        <dd><input type="text" name="employmentid" id="" size="255" /></dd>
                    </dl>
                    <dl>
                        <dt><label for="firstname">Your name:</label></dt>
                        <dd><input type="text" name="name" id="" size="255" /></dd>
                    </dl>
                     <dl>
                        <dt><label for="username">Username:</label></dt>
                        <dd><input type="text" name="username" id="" size="255" /></dd>
                    </dl>
                     <dl>
                        <dt><label for="email">Email Address:</label></dt>
                        <dd><input type="text" name="email" id="" size="255" /></dd>
                    </dl>
                    
                    <dl>
                        <dt><label for="password">password:</label></dt>
                        <dd><input type="text" name="password" id="" size="255" /></dd>
                    </dl>  
                     
                      <dl>
                        <dt><label for="department">Department:</label></dt>
                        <dd><input type="text" name="department" id="" size="255" /></dd>
                    </dl>
                    <button type="submit" name="" value="" >Submit</button>
                     <button type="reset" name="" value="" >Reset</button>
                       <button type="button" onclick="{location.href='index.jsp'}">Login</button>
                  
      
                    &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                           
                 
         </form>

</body>
</html>