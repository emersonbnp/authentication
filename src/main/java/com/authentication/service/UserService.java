package com.authentication.service;

import java.util.Optional;

import com.authentication.entity.User;
import com.authentication.exception.EntityNotFoundException;

public interface UserService {

	User findById(Integer id) throws EntityNotFoundException;

	User findByEmailAndPassword(String email, String password) throws EntityNotFoundException;

	Optional<User> findByEmail(String email);
}