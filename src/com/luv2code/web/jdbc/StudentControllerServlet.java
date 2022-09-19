package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDbUtil studentDbUtil;
	
	@Resource(name="jdbc/shopdunk")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			studentDbUtil = new StudentDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			String theCommand = request.getParameter("command");
			if(theCommand == null) {
				theCommand = "LIST";
			}
			switch(theCommand) {
			case "LIST":
				listStudents(request, response);			
				break;
			case "ADD":
				addStudent(request,response);
				break;
			case "LOAD":
				loadStudent(request,response);
				break;
			case "UPDATE":	
				updateStudent(request,response);
				break;
			case "DELETE":
				deleteStudent(request,response);
				break;
			case "LOGIN":
				login(request,response);
			default:
				listStudents(request, response);
			}
			
			
		}
		catch(Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String username = request.getParameter("userName");
		String password = request.getParameter("passWord");
		
		LoginBean loginBean = new LoginBean(username,password);
		
		if (studentDbUtil.validate(loginBean)) {
			 	
			
		 	RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/loginsuccess.jsp");
			dispatcher.forward(request, response);	
			
		} else {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/loginfail.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) 
	throws Exception{
		
		// read student id from form data
		String theStudentId = request.getParameter("studentId");

		//delete student from database
		studentDbUtil.deleteStudent(theStudentId);
		
		//send them back to the "list students" page
		listStudents(request,response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) 
	throws Exception{
		
		//read student info from form data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		
		//create a new student object
		Student theStudent = new Student(id,firstName, lastName,userName,passWord, email,phoneNumber); 
		
		//perform update on database
		studentDbUtil.updateStudent(theStudent);
		
		//send them back to the "list students" page
		listStudents(request,response);
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		// read student id from form data
				String theStudentId = request.getParameter("studentId");
				
				// get student from database (db util)
				Student theStudent = studentDbUtil.getStudent(theStudentId);
				
				// place student in the request attribute
				request.setAttribute("THE_STUDENT", theStudent);
				
				// send to jsp page: update-student-form.jsp
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher("/update-student-form.jsp");
				dispatcher.forward(request, response);		
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//read student infor from data
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		
		//create student object
		Student theStudent = new Student(firstName, lastName,userName,passWord, email,phoneNumber);
		
		//add student to the database
		studentDbUtil.addStudent(theStudent);
		
		//send back to the main page
		listStudents(request,response);
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Student> students = studentDbUtil.getStudents();
		
		// add students to the request
		request.setAttribute("STUDENT_LIST", students);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
	}

}













