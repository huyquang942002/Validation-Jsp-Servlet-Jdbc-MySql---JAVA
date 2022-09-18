<!DOCTYPE html>
<html>

<head>
	<title>Register form</title>
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>

	<div>
	
	<div class="container">
  		<div class="title">Registration</div>
  	<form action="StudentControllerServlet" method ="GET">
  			<input type="hidden" name="command" value="ADD">
  	
   	 	<div class="user__details">
      		<div class="input__box">
        		<span class="details">First Name</span>
        			<input type="text" name="firstName" placeholder="First Name" required>
        </div>
        
        <div class="input__box">
        	<span class="details">Last Name</span>
        		<input type="text" name="lastName" placeholder="Last Name" required>
        </div>
        
       <div class="input__box">
        	<span class="details">UserName</span>
        		<input type="text" name="userName" placeholder="username" required>
       </div>
       
       <div class="input__box">
       	 	<span class="details">Password</span>
        		<input type="password" name="passWord" placeholder="********" required>
       </div>
       
        <div class="input__box">
        	<span class="details">Email</span>
       			<input type="email" name="email" placeholder="huydepzai@gmail.com" required>
        </div>
        
       
       <div class="input__box">
        	<span class="details">Phone Number</span>
        		<input type="text" name="phoneNumber" placeholder="012-345-6789" required>
       </div>

    </div>
    		
    	<div class="button">
      <input type="submit" value="Save">
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