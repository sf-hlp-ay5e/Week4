package com.bookshop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	Book book;

	@Before
	public void setUp() throws Exception {
		book = new Book ("The Care and Feeding of Tools", "Dave", "Poindexter");
	}

	@Test
	public void testAuthor() {
		assertEquals("Dave Poindexter", book.getAuthor().toString());
	}

	@Test
	public void testTitle() {
		assertEquals("The Care and Feeding of Tools", book.getTitle().toString());
	}

	@Test
	public void testToString() {
		assertEquals("title:The Care and Feeding of Tools, author:Dave Poindexter", book.toString());
	}

}
