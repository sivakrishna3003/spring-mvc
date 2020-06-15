package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("/abc")
	public String showPage() {
		System.out.println("testing for jenkins restart");
		return "home";
		
	}

}
