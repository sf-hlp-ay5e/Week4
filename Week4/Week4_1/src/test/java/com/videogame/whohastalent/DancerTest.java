package com.videogame.whohastalent;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DancerTest {

	Dancer dancer;
	
	@Before
	public void setup() {
	}

	@Test
	public void testGoodTapPerform() {
		dancer = new Dancer(DanceStyle.TAP);
		String performance = dancer.perform();
		assertEquals(true,performance.endsWith("dancer"));
	}

	@Test
	public void testGoodBalletPerform() {
		dancer = new Dancer(DanceStyle.BALLET);
		String performance = dancer.perform();
		assertEquals(true,performance.endsWith("dancer"));
	}

}
