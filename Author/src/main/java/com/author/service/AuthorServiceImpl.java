package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.author.modal.Author;

@Service
public class AuthorServiceImpl implements IAuthorService{
	
	@Autowired
	private IAuthoRepository authorRepository;

	@Override
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
		}
	}
	
	