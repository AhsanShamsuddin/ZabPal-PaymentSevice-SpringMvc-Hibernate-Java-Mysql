package com.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.user;
import com.services.userI;

@Controller
public class bankaccount {
	
	@Autowired
	private userI su;
	
	@GetMapping("/udAccount")
	public String account(Model mv) {
		
		user us = new user();
		
		mv.addAttribute("UA", us);
		
		return "update";
	}
	
	@GetMapping("/updateAccount")
	public String create(@ModelAttribute("UA") user u,HttpSession session){
		
		int id = (int)session.getAttribute("ID");

		su.updateUser(id,u);
		return "redirect:/udAccount";
	}
	
	@GetMapping("/deposit")
	public String deposit(@ModelAttribute("dp") user u,Model mv) {
		
		mv.addAttribute("dp",u);
		return "Deposit";
	}
	
	@GetMapping("/addAmount")
	public String addAmount(@ModelAttribute("dp") user u,HttpSession session){
		int id = (int)session.getAttribute("ID");
		int amount = (int)session.getAttribute("Total");

		su.depositamount(id,u,amount);
		return "redirect:/deposit";
	}
	
	@GetMapping("/withdraw")
	public String withdraw(@ModelAttribute("wd") user u,Model mv) {
		
		mv.addAttribute("wd",u);
		return "Withdraw";
	}
	
	@GetMapping("/subAmount")
	public String subAmount(@ModelAttribute("wd") user u,HttpSession session){
		int id = (int)session.getAttribute("ID");
		int amount = (int)session.getAttribute("Total");

		System.out.println("Amount = "+amount);
		su.withdrawamount(id, u, amount);
		return "redirect:/withdraw";
	}
	
	@GetMapping("/logout")
	public String logout(Model mv) {
		return "redirect:/login";
	}

}
