<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="Container">

<div class="Login">
<h1>Sign In </h1>
<form action="Menu" method="post">
<input type="text" placeholder="Email Id" id="userid" name="userid">
<input type="password" placeholder="Password" id="password" name="password">
<input type="submit" value="sign in"> 
</form>
</div>
</div>

</body>
</html>