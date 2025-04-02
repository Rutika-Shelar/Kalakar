package com.artifacts.kalakar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {

	@GetMapping("/")
    public String homePage() {
        return "HomePage";
    }
   
    @GetMapping("/register")
    public String registrationPage() {
        return "RegistrationPage";
    }
    
    @GetMapping("/login")
    public String loginPage() {
        return "LoginPage";
    }
    
    
    @GetMapping("/booking")
    public String bookingPage() {
		return "BookingPage";
	}
    @GetMapping("/profile")
    public String profilePage() {
    	return "ProfilePage";
    }
    
    
 
}
