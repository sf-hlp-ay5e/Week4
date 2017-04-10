package com.videogame.whohastalent;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VocalistTest {

	Vocalist vocalist;
	
	@Before
	public void setup() {
		vocalist = new Vocalist(MusicalKey.G);
	}

	@Test
	public void testGoodPerform() {
		assertEquals(true,vocalist.perform().startsWith("I sing in the key of "));
	}

	@Test
	public void testGoodPerformWithVolume() {
		String performance = vocalist.perform(5);
		assertEquals(true,performance.startsWith("I sing in the key of "));
		assertEquals(true,performance.contains("at the volume "));
	}

	@Test
	public void testLowPerformWithVolume() {
		String performance = vocalist.perform(0);
		assertEquals(false,performance.startsWith("I sing in the key of "));
		assertEquals(false,performance.contains("at the volume "));
	}

	@Test
	public void testHighPerformWithVolume() {
		String performance = vocalist.perform(11);
		assertEquals(false,performance.startsWith("I sing in the key of "));
		assertEquals(false,performance.contains("at the volume "));
	}
}
