package com.bookshop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

	Author author;
	
	@Before
	public void setUp() throws Exception {
		author = new Author("Dave","Poindexter");
	}

	@Test
	public void testToString() {
		assertEquals("Dave Poindexter",author.toString());
	}

	@Test
	public void testFirstName() {
		assertEquals("Dave",author.getFirstName());
	}

	@Test
	public void testLastName() {
		assertEquals("Poindexter",author.getLastName());
	}

}
