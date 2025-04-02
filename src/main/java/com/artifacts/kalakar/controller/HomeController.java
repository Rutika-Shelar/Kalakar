package com.artifacts.kalakar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.artifacts.kalakar.entity.User;
import com.artifacts.kalakar.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/search")
	public List<User> searchArtist(@RequestParam String field){
		return userService.searchUserByName(field);
	}
    
}