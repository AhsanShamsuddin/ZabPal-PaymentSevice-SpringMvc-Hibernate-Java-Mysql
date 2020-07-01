package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Ahmad;
import com.model.Arsalan;
import com.services.AhmadCRUDService;

@Controller
public class AhmadCRUDController {
	
	@Autowired
	private AhmadCRUDService serv;
	
	@GetMapping("/ahmad")
	public String AhmadAdd(Model mv) {
		
	    Ahmad ahm = new Ahmad();
			
		mv.addAttribute("ahm", ahm);
		
		List<Ahmad> a = serv.getAhmad();
		mv.addAttribute("listAhmad", a);
		
		return "ahmad-crud";
	}
	
	@PostMapping("/saveahmad")
	public String abc(@ModelAttribute("ahm")Ahmad ahm,Model mv ) {
		
		List<Ahmad> a = serv.getAhmad();
		mv.addAttribute("listAhmad", a);
		
		serv.add(ahm);
		
		return "redirect:/ahmad" ;
	}

	@GetMapping("/deleteAhmad/{ahrid}")
	public String del(@PathVariable int ahrid) {
		serv.deleteAhmad(ahrid);
		
		return "redirect:/ahmad";
	}
	
}
