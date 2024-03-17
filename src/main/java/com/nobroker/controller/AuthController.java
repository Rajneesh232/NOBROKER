package com.nobroker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nobroker.payload.UserDto;
import com.nobroker.service.UserService;

@RestController
//@RequestMapping("/auth")
public class AuthController {
	// UserController
@Autowired
	private UserService userService;

	@PostMapping("/abc")
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {

		long userId = userService.createUser(userDto);

		return new ResponseEntity<>("user is created & userId is:" + userId, HttpStatus.CREATED);

	}
}
