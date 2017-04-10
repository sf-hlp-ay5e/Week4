package com.videogame.whohastalent;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DanceStyleTest {
	
	DanceStyle danceStyleTap;
	DanceStyle danceStyleBallet;

	@Before
	public void setUp() {
		danceStyleTap = DanceStyle.TAP;
		danceStyleBallet = DanceStyle.BALLET;
	}

	@Test
	public void testDanceStyleTap() {
		assertEquals("TAP", danceStyleTap.toString());
	}

	@Test
	public void testDanceStyleBallet() {
		assertEquals("BALLET", danceStyleBallet.toString());
	}

}
