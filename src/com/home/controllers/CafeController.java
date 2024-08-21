package com.home.controllers;

import javax.management.loading.PrivateClassLoader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CafeController {
	
	@RequestMapping("/cafe")
	public String getHomePage(Model model) {
		
		String titleName = "Mom's Cafe";     
		model.addAttribute("titleNameValue", titleName);
		
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		
		String foodType = request.getParameter("foodType");
		model.addAttribute("foodTypeValue", foodType);
		
		return "process-order-page";
	}

}
