package com.authentication.security.util;

import java.util.Optional;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.authentication.entity.User;
import com.authentication.exception.UserNotFoundException;
import com.authentication.service.UserService;

@Component
public class SecurityUtils {

	private static UserService userService;

	public SecurityUtils(UserService userService) {
		SecurityUtils.userService = userService;
	}

	public static User getAuthenticatedUser() throws UserNotFoundException {
		Optional<User> user = userService.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
		return user.orElseThrow(() -> new UserNotFoundException());
	}
}
