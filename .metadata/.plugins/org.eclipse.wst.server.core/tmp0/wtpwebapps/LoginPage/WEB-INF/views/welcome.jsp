<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
<%@ include file="/WEB-INF/resources/components/all_links.jsp"%>

</head>
<body>
	<%@ include file="/WEB-INF/resources/components/navbarWeCom.jsp"%>


	<h1>User Login Successfully === ${userLogin.userName }</h1>





</body>
</html>