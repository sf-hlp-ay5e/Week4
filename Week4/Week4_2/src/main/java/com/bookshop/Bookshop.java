package com.bookshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Bookshop {

	private List<Book> bookList;
	
	public Bookshop() {
		List<Book> bookList = new ArrayList<Book>();

		Date date1 = new Date();
		Date date2 = new Date();

		bookList.add(new Magazine("Diners, Dives, and Drive-ins", "Guy", "Fiero", "Math.Random House", "666 Diablo Way, Death Valley, CA"));
		bookList.add(new Magazine("Gentle Ben's Weekly", "Yogi", "Berra", "Penguin Publications", "South Pole, Antarctica"));
		bookList.add(new Book("The Care and Feeding of Tools","Dave","Poindexter"));
		bookList.add(new Book("Java HOW TO PROGRAM","Paul","Deitel"));
		bookList.add(new ElectronicBook("Electricians Handbook", "Sparky", "Lyle", date1));
		bookList.add(new ElectronicBook("Test Driven Development: By Example", "Kent", "Beck", date2));
		this.setBookList(bookList);
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public long calculatePrice() {
		long totalPrice = 0;
		long price;
		String report = "";
		for (Book book : bookList) {
			price = book.calculatePrice();
			report += book.toString() + ", Price $" + price + "\n";
			totalPrice += price;
		}
		report += "Total Price $" + totalPrice;
		System.out.println(report);
		return totalPrice;
	}
	
}
