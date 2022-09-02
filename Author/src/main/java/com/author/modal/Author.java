package com.author.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Author {

	@Id
	@SequenceGenerator(name = "gen1",initialValue = 100,allocationSize = 5,sequenceName = "bookId_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String bookId;

	@Column(nullable = false, length = 20)
	private String title;

	@Column(nullable = false, length = 20)
	private String authorName;

	@Column(nullable = false, length = 15)
	private Double price;

	@Column
	private String image;

	@Column(length = 20)
	private String publisher;

	@Column(length = 15)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date releasedDate;

	@Column(length = 10)
	private String active;

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Author(String bookId, String title, String authorName, String image, String publisher, Date releasedDate,
			Double price, String active) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.authorName = authorName;
		this.image = image;
		this.publisher = publisher;
		this.releasedDate = releasedDate;
		this.price = price;
		this.active = active;
	}

	public Author() {
		super();
	}

	public Author(String title, String authorName, String publisher, Date releasedDate) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.releasedDate = releasedDate;
	}

}
