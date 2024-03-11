<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@ include file="/WEB-INF/resources/components/all_links.jsp" %>

</head>
<body>
<!-- Navbar -->
<%@ include file="/WEB-INF/resources/components/navbar.jsp" %>

<img alt="image_is_notFound" src='<c:url value="/resources/images/walpaper.jpg"/>' width="100%" height="90vh"/>

<%@ include file="/WEB-INF/resources/components/footer.jsp" %>

	
	
</body>
</html>