package com.videogame.whohastalent;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class AuditionTest {
	
	Audition audition;

	@Before
	public void setUp() {
		audition = new Audition();
	}
	
	@Test
	public void testPerformerListCreated() {
		assertEquals(7,audition.performerList.size());
	}

	@Test
	public void performGoodAudition() {
		String performance = audition.performAll();
//		System.out.println(performance);
		assert(performance.contains("performer"));
		assert(performance.contains("dancer"));
		assert(performance.contains("I sing at"));
	}
}
