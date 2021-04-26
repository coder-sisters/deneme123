package com.example.deneme123.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.deneme123.entity.Note;
import com.example.deneme123.serviceBL.NoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	private NoteService noteService;

	@GetMapping({ "/", "/index" })
	public String hello(@RequestParam(value = "name", defaultValue = "World", required = true) String name,
			Model model) {
		name = name == null || name.trim().equals("") ? "Thymeleaf" : name;
		model.addAttribute("name", name);
		return "index";
	}

	@RequestMapping(value = "/single", method = RequestMethod.GET)
	public String single(Model model) {

		Note note = new Note();
		note.setTitle("merhaba");
		note.setContent("nasılsınız");
		note.setUser_id(1);
		
		noteService.createNote(note);

		return "single";
	}
	
}
