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

	public boolean signUp(String username, String email, String password, String role) {
		if (userRepo.findByUsername(username) != null || userRepo.findByEmail(email) != null) {
			System.out.println("Email already exists");

			return false;
		}

		Users user = new Users();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);

		try {
			userRepo.save(user);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean login(String username, String password) {
		Users user = userRepo.findByUsername(username);
		if (user == null || !user.getPassword().equals(password)) {

			return false;
		}

		currentUser = user;
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
