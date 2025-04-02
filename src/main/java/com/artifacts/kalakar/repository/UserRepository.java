package com.artifacts.kalakar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artifacts.kalakar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
	
}
