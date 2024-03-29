package com.authentication.security.util;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Response <T> {

	public Response(T data) {
		super();
		this.data = data;
	}
	public Response(List<String> errors) {
		this.errors = errors;
	}
	public Response() {
	}
	private T data;
	private List<String> errors = new ArrayList<>();
	
}
