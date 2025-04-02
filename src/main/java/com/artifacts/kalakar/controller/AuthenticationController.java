package com.artifacts.kalakar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.artifacts.kalakar.entity.User;
import com.artifacts.kalakar.service.UserService;

@Controller
public class AuthenticationController {


	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
	    try {
	        userservice.register(user);
	        redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
	        return "redirect:/"; 
	    } catch (Exception e) {
	        redirectAttributes.addFlashAttribute("errorMessage", "Invalid Data!");
	        return "redirect:/register"; 
	    }
	}
	

	

		
		@PostMapping("/login")
	    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
	        User user = userservice.findByEmail(email);

	        if (user != null && user.getPassword().equals(password)) {  
	            model.addAttribute("successMessage", "Login successful!");
	            return "HomePage";
	        } else {
	            model.addAttribute("errorMessage", "Invalid email or password!");
	            return "LoginPage"; 
	        }
	    }
		
	
	    @GetMapping("/logout")
	    public String logoutUser(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("successMessage", "Logout successful!");
	        return "redirect:/login";
	    }

	}