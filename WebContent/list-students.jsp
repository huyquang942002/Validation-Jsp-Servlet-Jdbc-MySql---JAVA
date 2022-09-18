<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>List Customer</title>	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>



<body>

	<div id="wrapper">
		<div id="header">
			<h2>List Customer</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<input type="button" value="Add Customer"
			onclick="window.location.href='add-student-form.jsp';return false;"
			class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>UserName</th>
					<th>PassWord</th>
					<th>Email</th>
					<th>PhoneNumber</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				
					<c:url var="tempLink" value="StudentControllerServlet">
						<c:param name="command" value="LOAD"/>
						<c:param name="studentId" value="${tempStudent.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="StudentControllerServlet">
						<c:param name="command" value="DELETE"/>
						<c:param name="studentId" value="${tempStudent.id}"/>
					</c:url>
				
					<tr>
						<td>  ${tempStudent.firstName}  </td>	
						<td>  ${tempStudent.lastName}  </td>
						<td>  ${tempStudent.userName}  </td>	
						<td>  ${tempStudent.passWord}  </td>
						<td>  ${tempStudent.email}  </td>
						<td>  ${tempStudent.phoneNumber}  </td>
						
						<td> 
							<a href="${tempLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="if(!(confirm('are you sure you want to delete this student?')))
									 return false"
							>Delete</a>
							
						</td>
					</tr>
					
				</c:forEach>
				
				
			</table>
		
		</div>
	
	</div>
	
	<div style="clear:both;"></div>
		<p>
			<a href="index.html">Back To List</a>
		</p>
	</div>
</body>


</html>








