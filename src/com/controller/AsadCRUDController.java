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
import com.model.Asad;
import com.services.AsadCRUDService;

@Controller
public class AsadCRUDController {
	
	@Autowired
	private AsadCRUDService sss;
	
	@GetMapping("/asad")
	public String adminlogin(Model mv) {
		
		Asad asa = new Asad();
		mv.addAttribute("a",asa);
		List<Asad> aa = sss.getAsad();
		mv.addAttribute("listasad", aa);
		
		return "asadcrud";
		
	}
	@PostMapping("/saveasad")
	public String bbbb(@ModelAttribute("a")Asad a,Model mv){
		
		List<Asad> aa = sss.getAsad();
		mv.addAttribute("listasad", aa);
		
		sss.add(a);
		return "redirect:/asad";
		
	}
	@GetMapping("/deleteAsad/{id}")
	public String del(@PathVariable int id){
		sss.deleteAsad(id);
		return "redirect:/asad";
	}
	

}
