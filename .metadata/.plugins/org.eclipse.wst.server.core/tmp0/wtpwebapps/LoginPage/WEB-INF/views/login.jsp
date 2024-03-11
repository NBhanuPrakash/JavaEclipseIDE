<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@ include file="/WEB-INF/resources/components/all_links.jsp"%>

</head>
<body>
	<%@ include file="/WEB-INF/resources/components/navbar.jsp"%>

	<!-- SingIn -->

	<div class="signInForm" id="signIn" style="display: block">
		<section class="vh-100 mt-5">
			<div class="container-fluid h-custom">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-md-9 col-lg-6 col-xl-5">
						<img
							src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
							class="img-fluid" alt="Sample image" />
					</div>
					<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
						<form action="userlogin" method="post">
							<div
								class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
								<p class="lead fw-normal mb-0 me-3">Sign in with</p>
								<button type="button" class="btn btn-primary btn-floating mx-1">
									<i class="fab fa-facebook-f"></i>
								</button>

								<button type="button" class="btn btn-primary btn-floating mx-1">
									<i class="fab fa-twitter"></i>
								</button>

								<button type="button" class="btn btn-primary btn-floating mx-1">
									<i class="fab fa-linkedin-in"></i>
								</button>
							</div>
					<!-- 		<c:if test="${not empty message}">
								<p class="fs-3 fw-bold text-success">${message}<p />
												<c:remove var="msg" />
												
												</c:if> -->

							<div class="divider d-flex align-items-center my-4">
								<p class="text-center fw-bold mx-3 mb-0">Or</p>
							</div>

							<c:if test="${not empty msg }">
								<p class="fs-3 fw-bold text-success">${msg}<p />
												<c:remove var="msg" />
												
												</c:if>

							<!-- Email input --><div clas s="form-outline mb-4">
								<input type="email" id="form3Example3"
									class="form-control form-control-lg"
									placeholder="Enter a valid email address" name="email" /> <label
									class="form-label" for="form3Example3">Email address</label>
							</div>

							<!-- Password input -->
							<div class="form-outline mb-3">
								<input type="password" id="form3Example4"
									class="form-control form-control-lg"
									placeholder="Enter password" name="password" /> <label
									class="form-label" for="form3Example4">Password</label>
							</div>

							<div class="d-flex justify-content-between align-items-center">
								<!-- Checkbox -->
								<div class="form-check mb-0">
									<input class="form-check-input me-2" type="checkbox" value=""
										id="form2Example3" /> <label class="form-check-label"
										for="form2Example3"> Remember me </label>
								</div>
								<a href="emailValidate" class="text-body" id="forgotPassword">Forgot
									password?</a>
							</div>

							<div class="text-center text-lg-start mt-4 pt-2">
								<input type="submit" class="btn btn-primary btn-lg"
									style="padding-left: 2.5rem; padding-right: 2.5rem"
									value="SignIn">
								<p class="small fw-bold mt-2 pt-1 mb-0">
									Don't have an account? <a href="register" class="link-danger"
										id="showSignUpLink">Register</a>
								</p>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>
	</div>
<%@ include file="/WEB-INF/resources/components/footer.jsp"%>

</body>
</html>