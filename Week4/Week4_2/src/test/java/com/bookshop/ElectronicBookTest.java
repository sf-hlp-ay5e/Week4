package com.bookshop;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ElectronicBookTest {

	ElectronicBook electronicBook;
	Date date1;
	
	@Before
	public void setUp() {
		date1 = new Date();
		electronicBook = new ElectronicBook("Electricians Handbook", "Sparky", "Lyle", date1);
	}

	@Test
	public void testElectronicBook() {
		String expected = electronicBook.toString(); 
		assertEquals(expected, electronicBook.toString());
	}

	@Test
	public void testTransmit() {
		String expected = "transmitted"; 
		assertEquals(expected, electronicBook.transmit());
	}

}
