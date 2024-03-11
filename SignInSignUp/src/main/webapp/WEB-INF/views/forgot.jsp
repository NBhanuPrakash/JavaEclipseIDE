<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Forgot Password</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://kit.fontawesome.com/ed2f933003.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <!-- Navigation Page -->
    <nav class="navbar navbar-expand-lg navbar-light bg-primary">
      <a class="navbar-brand text-white ms-5" href="#">Forgot Password</a>
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNavAltMarkup"
        aria-controls="navbarNavAltMarkup"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav ms-auto">
          <a
            class="nav-item nav-link text-white me-4"
            href="#"
            id="showSignInForm"
            >SignIn</a
          >
          <a
            href="#"
            class="nav-item nav-link text-white me-4"
            id="showSignUpForm"
            >SignUp</a
          >
        </div>
      </div>
    </nav>

    <!-- Forgot Password -->

    <div
      class="container d-flex flex-column"
      id="forgotPassword"
      style="display: none"
    >
      <div
        class="row align-items-center justify-content-center min-vh-100"
        style="margin-top: -100px"
      >
        <div class="col-12 col-md-8 col-lg-4">
          <div class="card shadow-sm">
            <div class="card-body">
              <div class="mb-4">
                <h5>Forgot Password?</h5>
                <p class="mb-2">
                  Enter your registered email ID to reset the password
                </p>
              </div>
              <form action="emailValidation">
                <div class="mb-3">
                  <label for="emailField" class="form-label">Email</label>
                  <input
                    type="email"
                    id="emailField"
                    class="form-control"
                    name="emailField"
                    placeholder="Enter Your Email"
                    required
                  />
                </div>
             
                <div class="mt-3 d-grid">
                  <input
                    type="submit"
                    class="btn btn-primary"
                    value="Reset Password"
                  />  
                </div>
                <span>Don't have an account? <a href="#">sign in</a></span>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
    