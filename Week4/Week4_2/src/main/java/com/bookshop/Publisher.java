package com.bookshop;

class Publisher {

	private String name;
	private String address;
	
	// Constructors
	public Publisher(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}
	
	@Override
	public String toString() {
		return this.getName() + ", " + this.getAddress();
	}

	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
