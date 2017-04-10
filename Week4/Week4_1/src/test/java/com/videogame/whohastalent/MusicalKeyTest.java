package com.videogame.whohastalent;

import static org.junit.Assert.*;

import org.junit.Test;

public class MusicalKeyTest {

	MusicalKey keyOfA = MusicalKey.A;
	MusicalKey keyOfB = MusicalKey.B;
	MusicalKey keyOfC = MusicalKey.C;
	MusicalKey keyOfD = MusicalKey.D;
	MusicalKey keyOfE = MusicalKey.E;
	MusicalKey keyOfF = MusicalKey.F;
	MusicalKey keyOfG = MusicalKey.G;
	
	@Test
	public void testKeyOfA() {
		assertEquals("A",keyOfA.toString());
	}
	
	@Test
	public void testKeyOfB() {
		assertEquals("B",keyOfB.toString());
	}
	
	@Test
	public void testKeyOfC() {
		assertEquals("C",keyOfC.toString());
	}
	
	@Test
	public void testKeyOfD() {
		assertEquals("D",keyOfD.toString());
	}
	
	@Test
	public void testKeyOfE() {
		assertEquals("E",keyOfE.toString());
	}
	
	@Test
	public void testKeyOfF() {
		assertEquals("F",keyOfF.toString());
	}
	
	@Test
	public void testKeyOfG() {
		assertEquals("G",keyOfG.toString());
	}

}
