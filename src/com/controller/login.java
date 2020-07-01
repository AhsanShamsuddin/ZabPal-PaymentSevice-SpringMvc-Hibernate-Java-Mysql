package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import com.model.user;
import com.services.userI;

@Controller
public class login {
	@Autowired
	private userI serviceDao;
	
	@GetMapping("/login")
	public String log(Model mv) {
       user u = new user();
		
		mv.addAttribute("d", u);
		
		return "signin";
	}
	
	@PostMapping("/saveUser")
	public String save(@ModelAttribute("d")user u,Model m,HttpSession session ) {
		
		user us = serviceDao.checks(u);
		if(us!=null) {

			session.setAttribute("ID", us.getId());
			session.setAttribute("User", us.getFirstname());
			session.setAttribute("lName", us.getLastname());
			session.setAttribute("Email", us.getEmail());
			session.setAttribute("pass", us.getPassword());
			session.setAttribute("addr", us.getAddress());
			session.setAttribute("phnum", us.getPhNumber());
			session.setAttribute("card", us.getCardnum());
			session.setAttribute("Total", us.getTotal_balance());
			
			return "Uview";	

		}
		else {
			m.addAttribute("Error", "Invalid Email/Password");
			return "signin";
		}
		
	}

	
}
