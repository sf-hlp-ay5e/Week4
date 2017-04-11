package com.bookshop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookshopTest {

	Bookshop bookshop;
	
	@Before
	public void setUp() {
		bookshop = new Bookshop();
	}

	@Test
	public void testCreation() {
		assertEquals(6,bookshop.getBookList().size());
	}

	@Test
	public void testCalculatePrice() {
		long expected = 230;
		assertEquals(expected, bookshop.calculatePrice());
	}
}
