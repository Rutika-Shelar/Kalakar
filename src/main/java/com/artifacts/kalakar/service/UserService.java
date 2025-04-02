package com.artifacts.kalakar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artifacts.kalakar.entity.User;
import com.artifacts.kalakar.repository.ArtworkRepository;
import com.artifacts.kalakar.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ArtworkRepository artworkRepository;
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public void register(User user) {
		userRepository.save(user);
	}
	
	public boolean isEmailExists(String email) {
		return userRepository.findByEmail(email) != null;
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public List<User> searchUserByName(String name) {
	    return userRepository.findByName(name);
	}

}
