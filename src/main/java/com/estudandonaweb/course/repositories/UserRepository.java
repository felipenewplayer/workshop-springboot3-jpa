package com.estudandonaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandonaweb.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
		
		
}
