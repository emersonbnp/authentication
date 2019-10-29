package com.authentication.security;

import com.authentication.entity.User;
import com.authentication.security.util.BCryptUtil;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JwtUserFactory {

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), BCryptUtil.getHash(user.getPassword()));
	}

}
