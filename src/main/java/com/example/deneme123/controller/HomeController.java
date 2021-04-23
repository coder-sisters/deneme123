package com.example.deneme123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping({ "/", "/home" })
	public String hello(@RequestParam(value = "name", defaultValue = "World", required = true) String name,
			Model model) {
		model.addAttribute("name" ,  name);
		return "hello";
	}
	
	@GetMapping({ "/about"})
	public String about(Model model) {
		return "about";
	}

}
