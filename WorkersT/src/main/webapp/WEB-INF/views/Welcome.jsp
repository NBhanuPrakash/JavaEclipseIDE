<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Workers Table</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.table {
	margin-top: 10px; border : 1px solid #000;
	padding: 10px;
	margin-left: 450px;
	border: 1px solid #000;
}

.data {
	background-color: pink;
}

.data th {
	border: 1px solid #000;
	padding: 15px;
}

.button {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px;
}
button{
background: blue;
color:#fff;
padding:5px;
cursior:pointer;
font-weight:400;
cursor:pointer;
}
</style>
</head>
<body>
	<div class="container" style="margin: 0; padding: 0">

		<div class="heading">
			<h1
				style="background: blue; text-align: center; font-size: 30px; color: #fff; padding: 10px;">Workers
				Table</h1>
		</div>

		<table class="table">


			<tr class="data">
				<th>Employee ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Salary</th>
				<th>Joining Date</th>
				<th>Department</th>
				<th>Operations</th>


			</tr>
			<c:forEach var="worker" items="${worker}">
				<tr>
					<td>${worker.id}</td>
					<td>${worker.firstname}</td>
					<td>${worker.lastname}</td>
					<td>${worker.salary}</td>
					<td>${worker.joiningDate}</td>
					<td>${worker.department}</td>
					<td class="button"><button>Edit</button>
						<button>Delete</button></td>

				</tr>

			</c:forEach>

		</table>

	</div>
	



</body>
</html>