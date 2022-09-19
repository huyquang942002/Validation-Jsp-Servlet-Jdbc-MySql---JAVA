<!DOCTYPE html>
<html>

<head>
	<title>Log in</title>
	<link type="text/css" rel="stylesheet" href="css/login.css">	
</head>

<body>

	<script>
		function functionname(){
			alert("Login Fail , Try Again!");
		}
		functionname();
	</script>

	<div>
	
		<div class="container">
	  		<div class="title">Log In</div>
	  	<form action="StudentControllerServlet" method ="GET">
	  			<input type="hidden" name="command" value="LOGIN" />
	  	
	   	 	<div class="user__details">
			       <div class="input__box">
		        		<span class="details">UserName</span>
		        		<input type="text" name="userName" placeholder="username"  required>
	       		   </div>
	       
	       			<div class="input__box">
		       	 		<span class="details">Password</span>
		        		<input type="password" name="passWord" placeholder="*******"  required>
	       			</div>
	       			
	       			
	    	</div>
			    	<div class="button">
			      <input type="submit" value="Save">
			    	</div>
			    	
			    	<div class="font">
				    	<h5>Not a member ? 
				    			<a href="add-student-form.jsp">SignUp</a>
				    	</h5>
			    	</div>
	  	</form>
	</div>
				<div style="clear:both;"></div>
					<p>
						<a href="index.html">Back To List</a>
					</p>
				</div>
</body>

</html>











