package com.training.bean;

public class User {
	private int userUd;
	private String userName;
	private String userEmail;
	public int getUserUd() {
		return userUd;
	}
	public void setUserUd(int userUd) {
		this.userUd = userUd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "\nUser [userUd=" + userUd + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	public User(int userUd, String userName, String userEmail) {
		super();
		this.userUd = userUd;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	public User() {
		//default constructor
		// TODO Auto-generated constructor stub
	}
	
	

}
