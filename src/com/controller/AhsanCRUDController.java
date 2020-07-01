package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Ahsan;
import com.services.AhsanCRUDService;

@Controller
public class AhsanCRUDController {
	
	@Autowired
	private AhsanCRUDService serv;
	
	int Aid;
	
	@GetMapping("/ahsan")
	public String adminlogin(Model mv) {
		
	    Ahsan ahs = new Ahsan();
			
		mv.addAttribute("ah", ahs);
		
		List<Ahsan> a = serv.getAhsan();
		mv.addAttribute("listahsan", a);
		
		return "ahsan-crud";
	}
	
	@PostMapping("/saveahsan")
	public String abc(@ModelAttribute("ah")Ahsan ah,Model mv) {
		
		List<Ahsan> a = serv.getAhsan();
		mv.addAttribute("listahsan", a);
		
		serv.add(ah);
		
		return "redirect:/ahsan";
	}
	
	@GetMapping("/deleteAhsan/{aid}")
	public String del(@PathVariable int aid){
		serv.deleteAhsan(aid);
		return "redirect:/ahsan";
	}
	
}
