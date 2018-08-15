package com.infy.defecttracker.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.defecttracker.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
