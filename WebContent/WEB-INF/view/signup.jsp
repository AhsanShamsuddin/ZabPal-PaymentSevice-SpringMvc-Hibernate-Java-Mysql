<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Web Tech Project</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css1">
</head>
<body>

    <div class="main">
       <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">Sign up</h2>
						<form:form method="get" action="saveUser" modelAttribute="data">
                            <div class="form-group">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <form:input type="text" path="firstname" name="name" id="name" placeholder="First Name"/>
                            </div>
                            <div class="form-group">
                                <label for="lname"><i class="zmdi zmdi-account"></i></label>
                                <form:input type="text" path="lastname" name="lname" id="lname" placeholder="Last Name"/>
                            </div>
                            <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <form:input type="email" path="email" name="email" id="email" placeholder="Email"/>
                            </div>
                            <div class="form-group">
                                <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                <form:input type="password" path="password" name="pass" id="pass" placeholder="Password"/>
                            </div>
                            <div class="form-group">
                                <label for="addr"><i class="zmdi zmdi-account"></i></label>
                                <form:input type="text" path="address" name="addr" id="addr" placeholder="Address"/>
                            </div>
                            <div class="form-group">
                                <label for="phnum"><i class="zmdi zmdi-account"></i></label>
                                <form:input type="text" path="phNumber" name="phnum" id="phnum" placeholder="Phone Number"/>
                            </div>
                            <div class="form-group">
                                <label for="cNum"><i class="zmdi zmdi-account"></i></label>
                                <form:input type="text" path="cardnum" name="cNum" id="cNum" placeholder="Credit Card Number"/>
                            </div>
                            <div class="form-group">
                                <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="Create Account"/>
                            </div>
                        </form:form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="img/signup-image.jpg" alt="sing up image"></figure>
                        <a href="login" class="signup-image-link">I am already member</a>
                    </div>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main1.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>