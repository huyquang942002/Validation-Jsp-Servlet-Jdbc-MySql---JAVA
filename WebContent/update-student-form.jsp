<!DOCTYPE html>
<html>

<head>
	<title>Update Customer</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>

	<div>
	
	<div class="container">
  		<div class="title">Registration</div>
  	<form action="StudentControllerServlet" method ="GET">
  			<input type="hidden" name="command" value="UPDATE" />
			<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
  	
   	 	<div class="user__details">
      		<div class="input__box">
        		<span class="details">First Name</span>
        			<input type="text" name="firstName" value="${THE_STUDENT.firstName}"  required>
        </div>
        
        <div class="input__box">
        	<span class="details">Last Name</span>
        		<input type="text" name="lastName" value="${THE_STUDENT.lastName}"  required>
        </div>
        
       <div class="input__box">
        	<span class="details">UserName</span>
        		<input type="text" name="userName" value="${THE_STUDENT.userName}"  required>
       </div>
       
       <div class="input__box">
       	 	<span class="details">Password</span>
        		<input type="password" name="passWord" value="${THE_STUDENT.passWord}"  required>
       </div>
       
        <div class="input__box">
        	<span class="details">Email</span>
       			<input type="email" name="email" value="${THE_STUDENT.email}" required>
        </div>
        
       
       <div class="input__box">
        	<span class="details">Phone Number</span>
        		<input type="text" name="phoneNumber" value="${THE_STUDENT.phoneNumber}" required>
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











