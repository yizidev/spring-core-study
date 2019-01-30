package me.wonana.springcore.book;

import java.util.Date;

public class Book {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date created;
	
	private Enum<BookStatus> bookStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Enum<BookStatus> getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(Enum<BookStatus> bookStatus) {
		this.bookStatus = bookStatus;
	}
	
}
