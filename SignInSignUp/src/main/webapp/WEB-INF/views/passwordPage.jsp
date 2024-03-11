<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Password Conformation</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/ed2f933003.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- Navigation Page -->
	<nav class="navbar navbar-expand-lg navbar-light bg-primary">
		<a class="navbar-brand text-white ms-5" href="#"> Password Change</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav ms-auto">
				<a class="nav-item nav-link text-white me-4" href="#"
					id="showSignInForm">SignIn</a> <a href="#"
					class="nav-item nav-link text-white me-4" id="showSignUpForm">SignUp</a>
			</div>
		</div>
	</nav>
	<!-- Password Change Page -->

	<div class="container">
		<div class="signUpForm" id="signUp" style="display: block">
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
												Change Your Password</p>
												<span>${details}</span>

											<form class="mx-1 mx-md-4" action="setPassword" method="post">

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="email" id="form3Example3c"
															class="form-control" name="email" />
														<label class="form-label" for="form3Example3c">Your
															Email</label>
													</div>
												</div>

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="password" id="password" class="form-control"
															name="password" /> <label
															class="form-label" for="password">New
															Password</label>
													</div>
												</div>

												<div class="d-flex flex-row align-items-center mb-4">
													<i class="fas fa-key fa-lg me-3 fa-fw"></i>
													<div class="form-outline flex-fill mb-0">
														<input type="password" id="conformPassword"
															class="form-control" name="conformPassword"
															onblur="passwordvalidation()" />
														<label class="form-label" for="conformPassword">Conform
															Password</label>
													</div>
												</div>

												<div class="form-check d-flex justify-content-center mb-5">
													<input class="form-check-input me-2" type="checkbox"
														value="" id="form2Example3c" />
													<label class="form-check-label" for="form2Example3">
														I agree all statements in <a href="#!">Terms of
															service</a>
													</label>
												</div>

												<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
													<input type="submit" class="btn btn-primary btn-lg"
														value="Submit" />
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

	<script>
		// Conform Validation

		function passwordvalidation() {
			var password = document.getElementById("password").value;
			var conformpassword = document.getElementById("conformPassword").value;

			if (password !== conformpassword) {
				alert("New Password and Confirm Password do not match.");
				document.getElementById("conformPassword").value = "";
			}
		}
	</script>
</body>
</html>
