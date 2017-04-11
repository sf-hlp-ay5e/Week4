package com.bookshop;

class Magazine extends Book {
	
	private Publisher publisher;

	public Magazine(String title, String firstName, String lastName,
			String publisherName, String publisherAddress) {
		super(title, firstName, lastName);
		this.setPublisher(publisherName, publisherAddress);
	}

	@Override
	public long calculatePrice() {
		return super.calculatePrice() * 12;
	}

	@Override
	public String toString() {
		return super.toString() + ", publisher:" + getPublisher().toString();
	}
	
	// getters and setters
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setPublisher(String name, String address) {
		this.setPublisher(new Publisher(name, address));
	}
}
