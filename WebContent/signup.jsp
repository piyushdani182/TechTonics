<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign Up to Tech Tonics</title>

<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="loginfiles/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="loginfiles/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="loginfiles/assets/css/form-elements.css">
<link rel="stylesheet" href="loginfiles/assets/css/style.css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="loginfiles/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="loginfiles/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="loginfiles/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="loginfiles/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="loginfiles/assets/ico/apple-touch-icon-57-precomposed.png">

</head>

<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp">Atmecs</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">Home</a></li>
				<li><a href="signin.jsp">Tech Talks</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="signin.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
			</ul>
		</div>
	</nav>
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3 form-box">
			<div class="form-top">
				<div class="form-top-left">
					<center>
						<h3>Sign Up with Tech Tonics</h3>
					</center>
					</br>
					<p>${info}</p>
				</div>
				<div class="form-top-right">
					<i class="fa fa-lock"></i>
				</div>
			</div>
			<div class="form-bottom">
				<form role="form" action="SignUp" method="post" class="login-form">
					<div class="form-group">
						<label class="sr-only" for="form-username">Employee Id</label> <input
							type="text" name="empId" placeholder="Employee Id"
							class="form-username form-control" id="form-username">
					</div>
					<div class="form-group">
						<label class="sr-only" for="form-username">Employee Name</label> <input
							type="text" name="empName" placeholder="Employee Name"
							class="form-username form-control" id="form-username">
					</div>
					<div class="form-group">
						<label class="sr-only" for="form-username">Email Id</label> <input
							type="text" name="emailId" placeholder="example@atmecs.com"
							class="form-username form-control" id="form-username">
					</div>
					<div class="form-group">
						<label class="sr-only" for="form-password">Password</label> <input
							type="password" name="password" placeholder="Password..."
							class="form-password form-control" id="form-password">
					</div>
					<button type="submit" class="btn">Sign up!</button>
				</form>
			</div>
		</div>
	</div>
	</div>
	</div>

	</div>


	<!-- Javascript -->
	<script src="loginfiles/assets/js/jquery-1.11.1.min.js"></script>
	<script src="loginfiles/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="loginfiles/assets/js/jquery.backstretch.min.js"></script>
	<script src="loginfiles/assets/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

</body>

</html>