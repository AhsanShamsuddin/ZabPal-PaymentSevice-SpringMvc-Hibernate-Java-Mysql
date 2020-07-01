package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.implementation.ETransactionDAO;
import com.dao.implementation.ETransactionDAOImpl;
import com.model.ETransaction;
import com.model.user;
import com.services.ETransactionService;
import com.services.userI;

@Controller
public class ETransactionController {
	
	@Autowired
	private ETransactionService eserv;
	
	@Autowired
	private userI su;
	
	@GetMapping("/setupTransaction")
	public String etrans(Model mm) {
		
		ETransaction et =  new ETransaction();
		mm.addAttribute("ETR",et);
		
		List<user> u = eserv.getEmails();
		mm.addAttribute("emails", u);
		
		return "transaction";
		
	}
	
	@GetMapping("/makepayment")
	public String make(@ModelAttribute("ETR") ETransaction etransaction, Model mv,HttpSession session)
	{		
		eserv.maketrans(etransaction);
		
		System.out.println("You have succesfully make an online payment");
		return "redirect:/uview";
		
	}

}
