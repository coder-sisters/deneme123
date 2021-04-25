package com.example.deneme123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping({ "/", "/index" })
	public String hello(@RequestParam(value = "name", defaultValue = "World", required = true) String name,
			Model model) {
		name = name == null || name.trim().equals("") ? "Thymeleaf" : name;
		model.addAttribute("name" ,  name);
		return "index";
	}
	
	@GetMapping({ "/single" })
	public String single(@RequestParam(value = "name", defaultValue = "World", required = true) String name,
			Model model) {
		name = name == null || name.trim().equals("") ? "Thymeleaf" : name;
		model.addAttribute("name" ,  name);
		return "single";
	}
	
}
