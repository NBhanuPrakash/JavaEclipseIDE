<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>SignIn And SignUp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://kit.fontawesome.com/ed2f933003.js"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-primary">
			<a class="navbar-brand text-white ms-5" href="#">Home Section</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav ms-auto">
					<a class="nav-item nav-link active text-white me-4" href="#">Home
						<span class="sr-only"></span>
					</a> <a class="nav-item nav-link text-white me-4" href="#"
						id="showSignInForm">SignIn</a> <a href="#"
						class="nav-item nav-link text-white me-4" id="showSignUpForm">SignUp</a>
				</div>
			</div>
		</nav>
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
							<form action="signIn" method="post">
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

								<div class="divider d-flex align-items-center my-4">
									<p class="text-center fw-bold mx-3 mb-0">Or</p>
								</div>

								<!-- Email input -->
								<div class="form-outline mb-4">
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
									<a href="forgot" class="text-body" id="forgotPassword">Forgot
										password?</a>
								</div>

								<div class="text-center text-lg-start mt-4 pt-2">
									<input type="submit" class="btn btn-primary btn-lg"
										style="padding-left: 2.5rem; padding-right: 2.5rem"
										value="SignIn">
									<p class="small fw-bold mt-2 pt-1 mb-0">
										Don't have an account? <a href="#signUp" class="link-danger"
											id="showSignUpLink">Register</a>
									</p>
								</div>
							</form>
						</div>
					</div>
				</div>
			</section>
		</div>



		<!-- Register page -->

		<div class="signUpForm" id="signUp" style="display: none">
			<section class="vh-100" style="background-color: #eee">
				<div class="container h-100">
					<div
						class="row d-flex justify-content-center align-items-center h-100">
						<div class="col-lg-12 col-xl-11">
							<div class="card text-black" style="border-radius: 25px">
								<div class="card-body p-md-5">
									<div class="row justify-content-center">
										<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
											<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">
												Sign up</p>

											<form class="mx-1 mx-md-4" action="insertTable" method="post">
												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-user fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="text" id="form3Example1c"
															class="form-control" name="userName" /> <label
															class="form-label" for="form3Example1c">Your Name</label>
													</div>
												</div>

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="email" id="form3Example3c"
															class="form-control" name="email" /> <label
															class="form-label" for="form3Example3c">Your
															Email</label>
													</div>
												</div>
												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-calendar-days fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="date" id="form3Example4cc"
															class="form-control" name="dateField" /> <label
															class="form-label" for="form3Example4cc">Date Of
															Birth</label>
													</div>
												</div>

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="password" id="password" class="form-control"
															name="password" /> <label class="form-label"
															for="password">Password</label>
													</div>
												</div>

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-key fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="password" id="conformPassword"
															class="form-control" name="conformPassword"
															onblur="passwordvalidation()" /> <label
															class="form-label" for="conformPassword">Repeat
															your password</label>
													</div>
												</div>

												<div class="form-check d-flex justify-content-center mb-5">
													<input class="form-check-input me-2" type="checkbox"
														value="" id="form2Example3c" /> <label
														class="form-check-label" for="form2Example3c"> I
														agree all statements in <a href="#!">Terms of service</a>
													</label>
												</div>

												<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
													<input type="submit" class="btn btn-primary btn-lg"
														value="Register">
												</div>
											</form>
										</div>
										<div
											class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
											<img
												src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
												class="img-fluid" alt="Sample image" />
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>
	<div class="container" style="margin-top: 90px">
		<footer>
			<div
				class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
				<!-- Copyright -->
				<div class="text-white mb-3 mb-md-0">Copyright © 2023. All
					rights reserved by NN Devlopers.</div>
				<!-- Copyright -->

				<!-- Right -->
				<div>
					<a href="#!" class="text-white me-4"> <i
						class="fab fa-facebook-f"></i>
					</a> <a href="#!" class="text-white me-4"> <i
						class="fab fa-twitter"></i>
					</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
					</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
					</a>
				</div>
				<!-- Right -->
			</div>
		</footer>
	</div>

	<script>
		// Date Formater

		var todayDate = new Date().toISOString().split("T")[0];
		document.getElementById("form3Example4cc").setAttribute("max",
				todayDate);

		//   SignUp Function

		document.getElementById("showSignInForm").addEventListener("click",
				function() {
					document.getElementById("signIn").style.display = "block";
					document.getElementById("signUp").style.display = "none";
				});

		// Function to show the Sign Up form and hide the Sign In form
		document
				.getElementById("showSignUpForm")
				.addEventListener(
						"click",
						function() {
							document.getElementById("signIn").style.display = "none";
							document.getElementById("signUp").style.display = "block";
							document.getElementById("forgotPassword").style.display = "none";
						});

		//Register Link

		document
				.getElementById("showSignUpLink")
				.addEventListener(
						"click",
						function() {
							document.getElementById("signIn").style.display = "none";
							document.getElementById("signUp").style.display = "block";
							document.getElementById("forgotPassword").style.display = "none";
						});

		//Forgot Password

		document
				.getElementById("forgotPassword")
				.addEventListener(
						"click",
						function() {
							document.getElementById("signIn").style.display = "none";
							document.getElementById("forgotPassword").style.display = "block";
							document.getElementById("signUp").style.display = "none";
						})

		// Conform Validation

		function passwordvalidation() {
			var password = document.getElementById("password").value;
			var conformpassword = document.getElementById("conformPassword").value;

			if (password !== conformpassword) {
				alert("Password and Confirm Password do not match.");
				document.getElementById("conformPassword").value = "";
			}
		}
	</script>
</body>
</html>
