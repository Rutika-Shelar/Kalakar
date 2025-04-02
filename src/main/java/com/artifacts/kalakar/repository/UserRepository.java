package com.artifacts.kalakar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.artifacts.kalakar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%', :name, '%'))")
	List<User> findByName(@Param("name") String name);
}
