package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Admin;
import com.model.ETransaction;
import com.model.user;
import com.services.AdminService;
import com.services.ETransactionService;
import com.services.userI;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService serviceDao;
	
	@Autowired
	private userI userviceDao;
	
	@Autowired
	private ETransactionService etDao;
	
	@GetMapping("/adminlogin")
	public String adminlogin(Model mv) {
		
		Admin admin = new Admin();
		
		mv.addAttribute("ad",admin);
		
		return "admin-login";
	}
	
	@PostMapping("/adminwork")
	public String save(@ModelAttribute("ad")Admin adm,Model m,HttpSession session ) {
		Admin admin = serviceDao.checkAdmin(adm);
		
		if(admin!=null) {
			return "admin-index";
		}
		else {
			m.addAttribute("Error", "Invalid Username/Password");
			return "admin-login";
		}
	}

	
	@GetMapping("/admin-index")
	public String adminindex(Model mv) {
		user u = new user();
		mv.addAttribute("totalUsers",userviceDao.countUsers(u));
		return "admin-index";
	}
	
	@GetMapping("/admin-charts")
	public String admincharts(Model mv) {
		return "admin-charts";
	}
	
	@GetMapping("/admin-404")
	public String admin404(Model mv) {
		return "admin-404";
	}
	
	@GetMapping("/admin-blank")
	public String adminblank(Model mv) {
		return "admin-blank";
	}
	
	@GetMapping("/admin-utables")
	public String adminutables(Model mv) {
		
		List<user> u = userviceDao.getData();
		mv.addAttribute("list", u);
		return "admin-utables";
	}
	
	@GetMapping("/admin-rtables")
	public String adminrtables(Model mv,HttpSession session ) {

		List<ETransaction> et = userviceDao.getRequests();
		mv.addAttribute("request", et);

		return "admin-rtables";
	}
	

	@GetMapping("/delete/{id}")
	public String delUser(@PathVariable int id){
		userviceDao.deleteUser(id);
		return "redirect:/admin-utables";
	}
	
	@GetMapping("/accept/{tid}/{amount}/{id}")
	public String acceptReq(@PathVariable int tid,@PathVariable int id,@PathVariable int amount, user u){
		etDao.acceptRequest(u, id, amount);
		etDao.deleteRequest(tid);
		return "redirect:/admin-rtables";
	}
	
	@GetMapping("/decline/{tid}")
	public String decilneReq(@PathVariable int tid){
		etDao.deleteRequest(tid);
		return "redirect:/admin-rtables";
	}
	
}
