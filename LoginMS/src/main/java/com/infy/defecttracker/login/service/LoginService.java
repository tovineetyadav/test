package com.infy.defecttracker.login.service;

import com.infy.defecttracker.login.dto.UserDTO;
import com.infy.defecttracker.login.exception.UserNotFound;

public interface LoginService {
	
	UserDTO getLoginUserByUserName(String username)throws UserNotFound;

}
