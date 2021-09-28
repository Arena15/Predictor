<%-- 
    Document   : register
    Created on : Sep 22, 2021, 2:30:17 PM
    Author     : solan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <link href="css/form.css" rel="stylesheet">
      <link rel="preconnect" href="https://fonts.googleapis.com">
        
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&display=swap" rel="stylesheet">

       <link href="css/bootstrap.min.css" rel="stylesheet">

   <link href="css/bootstrap-icons.css" rel="stylesheet">

            <link href="css/owl.carousel.min.css" rel="stylesheet">

      <link href="css/owl.theme.default.min.css" rel="stylesheet">

        <link href="css/templatemo-medic-care.css" rel="stylesheet">
    <section class="vh-200 bg-image" style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.jpg');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Create an account</h2>
<body id="top">
    
        <main>
  <br><br>
            <nav class="navbar navbar-expand-lg bg-light fixed-top shadow-lg">
                <div class="container">
                    <a class="navbar-brand mx-auto d-lg-none" href="index.html">
                        Diabetes Prediction
                        <strong class="d-block">Health Predictor</strong>
                    </a>

                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav mx-auto">
                               <a class="navbar-brand d-none d-lg-block" href="index.html">
                                Diabetes Prediction
                                <strong class="d-block">Health Predictor</strong>
                            </a>
                            
                              <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                               <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                               <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                               <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                               <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                               <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                                <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                                <li class="nav-item active">
                                <a class="nav-link" href=#></a>
                              </li>
                           
                            <li class="nav-item active">
                                <a class="nav-link" href="index.html">Home</a>
                            </li>

                          

                         
                           <li class="nav-item">
                                <a class="nav-link" href="login.jsp">Login</a>
                            </li>

                         
                           
                        </ul>
                    </div>

                </div>
            </nav>
             
  <form method=post action=registerServlet>
                <div class="form-outline mb-4">
                  <input type="text" id="form3Example4cdg"  name=txtid   class="form-control form-control-lg" />
                  <label class="form-label"for="form3Example4cdg">ID</label>
                </div>
                  
                <div class="form-outline mb-4">
                  <input type="text" id="form3Example1cg" name=txtFname class="form-control form-control-lg" />
                  <label class="form-label"  for="form3Example1cg">First  Name</label>
                </div>
                  
                 <div class="form-outline mb-4">
                  <input type="text"  name=txtLname  id="form3Example4cdg" class="form-control form-control-lg" />
                  <label class="form-label"  for="form3Example4cdg">Last Name</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="email" name=txtEmail id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label"  for="form3Example3cg">Your Email</label>
                </div>
                  
                     <div class="form-outline mb-4">
                  <input type="phone" name=txtPhone  id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example3cg">Your Phone No.</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="password" name=txtPass id="form3Example4cg" class="form-control form-control-lg" />
                  <label class="form-label"  for="form3Example4cg">Password</label>
                </div>

               

                <div class="form-check d-flex justify-content-center mb-5">
                  <input
                    class="form-check-input me-2"
                    type="checkbox"
                    value=""
                    id="form2Example3cg"
                  />
                  <label class="form-check-label" for="form2Example3g">
                    I agree all statements in <a href="#!" class="text-body"><u>Terms of service</u></a>
                  </label>
                </div>

                <div class="d-flex justify-content-center">
                  <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
                </div>

                <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="login.jsp" class="fw-bold text-body"><u>Login here</u></a></p>

              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</html>