package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.user;
import com.services.userI;

@Controller
public class registeration {

	@Autowired
	private userI serviceDao;
	
	@GetMapping("/register")
	public String regis(Model mv) {
		user u = new user();
		
		mv.addAttribute("data", u);
		
		return "signup";
	}
	
	@GetMapping("/saveUser")
	public String save(@ModelAttribute("data")user u) {
		
		serviceDao.addUser(u);
		
		
		return "redirect:/login";
	}
	
	
	
}
