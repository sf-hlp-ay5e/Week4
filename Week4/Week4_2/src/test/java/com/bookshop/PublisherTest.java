package com.bookshop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PublisherTest {
	
	Publisher publisher;

	@Before
	public void setUp() throws Exception {
		publisher = new Publisher("McGraw Hill", "123 N Main St, Minneapolis, MN");
	}

	@Test
	public void testGetName() {
		assertEquals("McGraw Hill",publisher.getName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("123 N Main St, Minneapolis, MN",publisher.getAddress());
	}

	@Test
	public void testToSting() {
		assertEquals("McGraw Hill, 123 N Main St, Minneapolis, MN",publisher.toString());
	}

}
