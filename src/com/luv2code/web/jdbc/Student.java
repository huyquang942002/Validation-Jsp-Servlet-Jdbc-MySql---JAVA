package com.luv2code.web.jdbc;

public class Student {


	
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private String email;
	private String phoneNumber;
	
	
	
	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public String getFirstName() {
		return firstName;
	}








	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}








	public String getLastName() {
		return lastName;
	}








	public void setLastName(String lastName) {
		this.lastName = lastName;
	}








	public String getUserName() {
		return userName;
	}








	public void setUserName(String userName) {
		this.userName = userName;
	}








	public String getPassWord() {
		return passWord;
	}








	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}








	public String getEmail() {
		return email;
	}








	public void setEmail(String email) {
		this.email = email;
	}








	public String getPhoneNumber() {
		return phoneNumber;
	}








	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}








	
	
	
	
	public Student(String firstName, String lastName, String userName, String passWord, String email,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}




	
	
	
	
	public Student(int id, String firstName, String lastName, String userName, String passWord, String email,
			String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	
		
		
	
	
	
	
	

	
}
