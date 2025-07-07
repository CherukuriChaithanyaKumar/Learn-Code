package com.example.Newsaggregationsystem.controller;

import com.example.Newsaggregationsystem.DTO.SignupRequestDTO;
import com.example.Newsaggregationsystem.service.AuthService;
import com.example.Newsaggregationsystem.DTO.LoginRequestDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public String signup(@RequestBody SignupRequestDTO signupRequest) {
		return authService.signUp(signupRequest.getUsername(), signupRequest.getEmail(), signupRequest.getPassword(),
				signupRequest.getRole());
	}

	@PostMapping("/login")
	public String login(@RequestBody LoginRequestDTO loginRequest) {
		boolean loggedIn = authService.login(loginRequest.getUsername(), loginRequest.getPassword());

		if (loggedIn) {
			return "Login successful";
		} else {
			return "Invalid credentials";
		}
	}
}
