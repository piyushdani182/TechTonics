<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Update Tech Talk</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="loginfiles/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="loginfiles/assets/font-awesome/css/font-awesome.min.css">
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
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="loginfiles/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="loginfiles/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="loginfiles/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="loginfiles/assets/ico/apple-touch-icon-57-precomposed.png">
    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Bootstrap</strong> Login Form</h1>
                            <div class="description">
                            	<p>
	                            	This is a free responsive login form made with Bootstrap. 
	                            	Download it on <a href="http://azmind.com"><strong>AZMIND</strong></a>, customize and use it as you like!
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<center><h3>Update Tech Talk</h3></center>
                        			</br>
                            		<%-- <p>${info}</p> --%>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-lock"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="UpdateTT" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<!-- <label class="sr-only" for="form-username">Tech Talk Id</label> -->
			                        	<input type="hidden" name="id" value="${techTalk.id}" class="form-username form-control" id="form-username" hidden="true">
			                        </div>
			                        <div class="form-group">
			                    		<label class="sr-only" for="form-username">Tech Talk Name</label>
			                        	<input type="text" name="name" value="${techTalk.name}" class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                    		<label class="sr-only" for="form-username">Description</label>
			                        	<input type="text" name="description" value="${techTalk.description}" class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Date</label>
			                        	<input type="text" name="date" value="${techTalk.date}" class="form-password form-control" id="form-password">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Presenter</label>
			                        	<input type="text" name="presenter" value="${techTalk.presenter}" class="form-password form-control" id="form-password">
			                        </div>
			                        <button type="submit" class="btn">Update</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			                        <button type="reset" class="btn">Reset</button>
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