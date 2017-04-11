package com.bookshop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagazineTest {

	Magazine magazine;
	
	@Before
	public void setUp() throws Exception {
		magazine = new Magazine("Gentle Ben's Weekly", "Yogi", "Berra", "Penguin Publications", "South Pole, Antarctica");
	}

	@Test
	public void testMagazine() {
		String expected = "title:Gentle Ben's Weekly, author:Yogi Berra, publisher:Penguin Publications, South Pole, Antarctica";
		assertEquals(expected,magazine.toString());
	}

	@Test
	public void testGetPublisher() {
		String expected = "Penguin Publications, South Pole, Antarctica";
		assertEquals(expected,magazine.getPublisher().toString());
	}

	@Test
	public void testSetPublisherPublisher() {
		magazine.setPublisher(new Publisher("Dell Publishing", "Wisconsin Dells, WI"));
		String expected = "Dell Publishing, Wisconsin Dells, WI";
		assertEquals(expected,magazine.getPublisher().toString());
	}

	@Test
	public void testSetPublisherStringString() {
		magazine.setPublisher(new Publisher("O'Reilly Media, Inc", "Boston, MA"));
		String expected = "O'Reilly Media, Inc, Boston, MA";
		assertEquals(expected,magazine.getPublisher().toString());
	}

}
