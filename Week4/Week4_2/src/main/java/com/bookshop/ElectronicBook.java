package com.bookshop;

import java.util.Date;

class ElectronicBook extends Book implements Transmittable {

	private Date dateSent;
	
	public ElectronicBook(String title, String firstName, String lastName, Date dateSent) {
		super(title, firstName, lastName);
		this.setDateSent(dateSent);
	}

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	@Override
	public long calculatePrice() {
		return 1;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getDateSent().toString();
	}

	public String transmit() {
		return "transmitted";
	}
}
