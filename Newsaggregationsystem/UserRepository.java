package com.example.Newsaggregationsystem.Repository;

import com.example.Newsaggregationsystem.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);

	Users findByEmail(String email);
}
