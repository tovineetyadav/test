package com.infy.defecttracker.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.defecttracker.login.dto.LoginDetail;
import com.infy.defecttracker.login.dto.UserDTO;
import com.infy.defecttracker.login.exception.UserNotFound;
import com.infy.defecttracker.login.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@PostMapping(value="/login/userDetails",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserDTO login(@RequestBody LoginDetail logindetail){
		UserDTO userdata = null;
		try {
			userdata = loginService.getLoginUserByUserName(logindetail.getUsername());
		} catch (UserNotFound e) {
			return userdata;
		}
		System.out.println("Hi.."+userdata.getUserName());
		if(userdata.getPassword().equals(logindetail.getPassword())){
			userdata.setValidUser(Boolean.TRUE);
			return userdata;
		}
		else{
			userdata.setValidUser(Boolean.FALSE);
			return userdata;
		}
	}
	
	

}
