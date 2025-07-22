package com.example.Newsaggregationsystem.controller;

import com.example.Newsaggregationsystem.Entities.Users;
import com.example.Newsaggregationsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}
}
