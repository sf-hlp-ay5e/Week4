package com.bookshop;

class Author {

	private String firstName;
	private String lastName;
	
	// Constructors
	public Author(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName();
	}

	// setters and getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
