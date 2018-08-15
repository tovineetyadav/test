package com.infy.defecttracker.login.dto;

import com.infy.defecttracker.login.entity.User;

public class UserDTO {
	
	private String userName;
	private String password;
	private String role;
	private boolean validUser;
	
	
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UserDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isValidUser() {
		return validUser;
	}



	public void setValidUser(boolean validUser) {
		this.validUser = validUser;
	}



	public static UserDTO valueOf(User user){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setRole(user.getUserrole());
		return userDTO;
	}
	
	

}
