package com.infy.defecttracker.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.defecttracker.login.dto.UserDTO;
import com.infy.defecttracker.login.entity.User;
import com.infy.defecttracker.login.exception.UserNotFound;
import com.infy.defecttracker.login.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO getLoginUserByUserName(String username) throws UserNotFound{
		User user =  userRepository.findByUsername(username);
		if(user==null)
			throw new UserNotFound();
		UserDTO userDTO = null;
		if(user!=null){
			userDTO = UserDTO.valueOf(user);
		}
		return userDTO;
	}
	
	
}
