<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Otp Validation</title>
<%@ include file="/WEB-INF/resources/components/all_links.jsp"%>

</head>
<body>

	<%@ include file="/WEB-INF/resources/components/navbar.jsp"%>


<div class="container d-flex flex-column" id="forgotPassword">
		<div class="row align-items-center justify-content-center min-vh-100"
			style="margin-top: -100px">
			<div class="col-12 col-md-8 col-lg-4">
				<div class="card shadow-sm">
					<div class="card-body">
						<div class="mb-4">
							<h5>Forgot Password?</h5>
							<p class="mb-2">Otp Validation</p>
						</div>
						<form action="otpvalidation">
							<div class="mb-3">
								<label for="otp" class="form-label">Otp Number</label> <input
									type="number" id="emailField" class="form-control"
									name="otp" placeholder="Enter Your OTP" required />
							</div>

							<div class="mt-3 d-grid">
								<input type="submit" class="btn btn-primary"
									value="Reset Password" />
							</div>
							<c:if test="${not empty msg }">
								<p class="fs-3 fw-bold text-success">${msg}<p />
												<c:remove var="msg" />
												
												</c:if>
							<span>Don't have an account? <a href="login">sign in</a></span>
						</form>
					</div>
				</div>
			</div>
		</div>

</body>
</html>