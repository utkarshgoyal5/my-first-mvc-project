package com.home.controllers;

import java.lang.invoke.StringConcatFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String getSugar() {
		return "Here is your sugar!";
	}

}
