package com.authentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public Optional<User> findByUsernameAndPassword(String username, String password);

	public Optional<User> findByEmail(String email);
	
}
