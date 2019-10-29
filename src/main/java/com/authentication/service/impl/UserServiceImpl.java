package com.authentication.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entity.User;
import com.authentication.exception.EntityNotFoundException;
import com.authentication.repository.UserRepository;
import com.authentication.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Integer id) throws EntityNotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
	}

	@Override
	public User findByEmailAndPassword(String username, String password) throws EntityNotFoundException {
		return userRepository.findByUsernameAndPassword(username, password)
				.orElseThrow(() -> new EntityNotFoundException());
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
