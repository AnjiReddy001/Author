package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.modal.Author;

public interface IAuthoRepository extends JpaRepository<Author, String> {
	

}
