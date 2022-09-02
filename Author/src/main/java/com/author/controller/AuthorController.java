package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.author.modal.Author;
import com.author.service.IAuthorService;

@RestController
@RequestMapping("/book")
public class AuthorController {
	@Autowired
	private IAuthorService service;
	
	@PostMapping("/digital")
	public Author createBook(@RequestParam("Author")Author author) {
		return service.createAuthor(author);
	}
	

}
