package com.springcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcode.repository.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}


	@RequestMapping(value="/get_all_authors",method=RequestMethod.GET)
	public String getAllAuthors(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
}
