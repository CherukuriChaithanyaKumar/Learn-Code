package com.example.Newsaggregationsystem.service;

import com.example.Newsaggregationsystem.Entities.Users;
import com.example.Newsaggregationsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	private final UserRepository userRepo;
	private Users currentUser;

	public AuthService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public String signUp(String username, String email, String password, String role) {
		if (username == null || username.trim().isEmpty()) {
			return "Username is required.";
		}
		if (email == null || email.trim().isEmpty()) {
			return "Email is required.";
		}
		if (!email.endsWith("@gmail.com")) {
			return "Only Gmail addresses are allowed.";
		}
		if (password == null || password.trim().isEmpty()) {
			return "Password is required.";
		}
		if (password.length() < 6) {
			return "Password must be at least 6 characters long.";
		}
		if (userRepo.findByUsername(username) != null || userRepo.findByEmail(email) != null) {
			return "Username or email already exists.";
		}

		Users user = new Users();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);

		try {
			userRepo.save(user);
			return "Signup successful";
		} catch (Exception e) {
			e.printStackTrace();
			return "An error occurred during signup.";
		}
	}
	public boolean login(String username, String password) {
		if (username == null || username.trim().isEmpty()) {
			System.out.println("Username is required.");
			return false;
		}
		if (password == null || password.trim().isEmpty()) {
			System.out.println("Password is required.");
			return false;
		}

		Users user = userRepo.findByUsername(username);
		if (user == null || !user.getPassword().equals(password)) {
			System.out.println("Invalid credentials.");
			return false;
		}

		currentUser = user;
		System.out.println("User logged in: " + username);
		return true;
	}

	public void logout() {
		currentUser = null;
	}

	public boolean isLoggedIn() {
		return currentUser != null;
	}

	public Users getCurrentUser() {
		return currentUser;
	}
}
