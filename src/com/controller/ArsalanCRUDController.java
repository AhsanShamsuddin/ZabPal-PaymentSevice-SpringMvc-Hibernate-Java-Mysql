package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Arsalan;
import com.services.ArsalanCRUDService;

@Controller
public class ArsalanCRUDController {
	
	@Autowired
	private ArsalanCRUDService serv;
	
	@GetMapping("/arsalan")
	public String arsal(Model mv) {
		
	    Arsalan ars = new Arsalan();
			
		mv.addAttribute("ah", ars);
		
		List<Arsalan> a = serv.getArsalan();
		mv.addAttribute("listarsalan", a);
		
		return "arsalan-crud";
	}
	
	@PostMapping("/savearsalan")
	public String xyz(@ModelAttribute("ah")Arsalan ah,Model mv ) {
		
		List<Arsalan> a = serv.getArsalan();
		mv.addAttribute("listarsalan", a);
		
		serv.add(ah);
		
		return "redirect:/arsalan" ;
	}
	
	@GetMapping("/deleteArsalan/{arid}")
	public String del(@PathVariable int arid) {
		serv.deleteArsalan(arid);
		
		return "redirect:/arsalan";
	}

	
}
