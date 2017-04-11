package com.bookshop;

class Book {
	private Author author;
	private String title;

	//Constructors
	public Book(String title, String firstName, String lastName) {
		super();
		this.setAuthor(new Author(firstName, lastName));
		this.setTitle(title);
	}
	
	public long calculatePrice() {
		return getAuthor().getFirstName().length() + getAuthor().getLastName().length();
	}
	
	@Override
	public String toString() {
		String bookAsString = "title:" + getTitle() + ", author:" + getAuthor().toString();
		return bookAsString;
	}
	
	// setters and getters
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
